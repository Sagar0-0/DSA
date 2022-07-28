public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        
        int num=0,n=A.length;
        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if((A[j]&(1<<i))==0)count++;
            }
            if(count%3==0)num|=(1<<i);
        }
        return num;
    }
}

