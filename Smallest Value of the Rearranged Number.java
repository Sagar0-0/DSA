class Solution {
    public long smallestNumber(long num) {
        int sign=1;
        if(num<0){
            sign=-1;
            num=0-num;
        }
        String s=Long.toString(num);
        int[] digits=new int[10];
        for(int i=0;i<s.length();i++){
            digits[s.charAt(i)-48]++;
        }
        if(sign==1){//positive
            //increasing
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<10;i++){
                if(digits[i]!=0){
                    sb.append((char)(i+48));
                    digits[i]--;
                    break;
                }
            }
            if(digits[0]!=0){
                while(digits[0]!=0){
                        sb.append('0');
                        digits[0]--;
                }
            }
            for(int i=1;i<10;i++){
                if(digits[i]!=0){
                    while(digits[i]!=0){
                        sb.append((char)(i+48));
                        digits[i]--;
                    }
                }
            }
            return Long.parseLong(sb.toString());
            
        }else{//negative
            //decreasing 
            StringBuilder sb=new StringBuilder();
            for(int i=9;i>=0;i--){
                if(digits[i]!=0){
                    while(digits[i]!=0){
                        sb.append((char)(i+48));
                        digits[i]--;
                    }
                }
            }
            return -Long.parseLong(sb.toString());
        }
    }
}
