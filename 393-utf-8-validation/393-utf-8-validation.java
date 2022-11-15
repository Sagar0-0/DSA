class Solution {
    public boolean validUtf8(int[] data) 
    {
	if(data==null || data.length==0) return false;
	boolean isValid = true;
	for(int i=0;i<data.length;i++) {
		if(data[i]>255) return false; // 1 after 8th digit, 100000000
		int numberOfBytes = 0;
		if((data[i] & 128) == 0) { // 0xxxxxxx, 1 byte, 128(10000000)
			numberOfBytes = 1;
		} else if((data[i] & 224) == 192) { // 110xxxxx, 2 bytes, 224(11100000), 192(11000000)
			numberOfBytes = 2;
		} else if((data[i] & 240) == 224) { // 1110xxxx, 3 bytes, 240(11110000), 224(11100000)
			numberOfBytes = 3;
		} else if((data[i] & 248) == 240) { // 11110xxx, 4 bytes, 248(11111000), 240(11110000)
			numberOfBytes = 4;
		} else {
			return false;
		}
		for(int j=1;j<numberOfBytes;j++) { // check that the next n bytes start with 10xxxxxx
			if(i+j>=data.length) return false;
			if((data[i+j] & 192) != 128) return false; // 192(11000000), 128(10000000)
		}
		i=i+numberOfBytes-1;
	}
	return isValid;
    }
}


//Approach 2


class Solution {
    public boolean validUtf8(int[] data) {
        int f[]=new int[256];
        for(int i=0;i<256;i++) {   // storing All sequences in in array having data[i] as index. As 0<=data[i]<=255, stored in f array
            int count=0;
            for(int j=7;j>=0;j--) {
                if((i&(1<<j))>0) {
                    count+=1;
                }
                else {
                    break;
                }
            }
           
            if(count<=4) f[i]=count; // if starting 1's count <=4 storing in f array
            else f[i]=-1;  //if starting 1's count>=5, it is not part of any utf-8 sequence making as -1
        }
        
        int bytes=-1;
        int sequence=-1;
        for(int i=0;i<data.length;i++) {
            int setBits=f[data[i]];
            if(setBits==-1) return false;  //if particular value at index equals -1, then returning false as it might not be part of any utf-8 sequence
            
            if(bytes==-1 || sequence==0 || sequence == -1 ) {   //if one sequence completed i.e , 2 having 11000000 10000000 10000000 then sequence becomes 0 or if 1->00000000 then sequence becomes -1
                bytes=f[data[i]];
                if(bytes==1 && (data[i]&(1<<7))>0) {
                    return false;
                }
                sequence=bytes-1;
                continue;
            }          
            
            if(setBits==1) { // After having starting , remaining sequence should contain only 1's
                sequence-=1;
            }
            else { // otherwise returning false
                return false;
            }
        }
      
        if(sequence==0 || sequence == -1) {   //At end sequence should be either 0 or -1 which means sequence completed for 0/1/2/3. for 0->sequence becomes -1, for 1,2,3->sequence becomes 0
             return true;
        }
        return false;
    }
}
