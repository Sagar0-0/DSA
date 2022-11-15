class Solution {
   public int smallestSubstring(String S) {
       // Code here
        int i=0,j=0,n=S.length();
        int count0=0,count1=0,count2=0,size=Integer.MAX_VALUE;
        while(j<n){
            if(S.charAt(j)=='0')
                count0++;
            else if(S.charAt(j)=='1')
                count1++;
            else
                count2++;
            if(count0>=1 && count1>=1 && count2>=1){
                while(count0>=1 && count1>=1 && count2>=1){
                    if(S.charAt(i)=='0'){
                        i++;
                        count0--;
                    }
                    else if(S.charAt(i)=='1'){
                        i++;
                        count1--;
                    }
                    else if(S.charAt(i)=='2')
                    {
                        i++;
                        count2--;
                    }
                }
                size=Math.min(size,j-i+2);
            }
            j++;
       }
        if(size==Integer.MAX_VALUE)
            return -1;
        return size;
   }
};
