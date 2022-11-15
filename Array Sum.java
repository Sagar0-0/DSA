public class Solution {
    public int[] addArrays(int[] A, int[] B) {
        int n1=A.length;
        int n2=B.length;
        int[] sum = new int[n1>n2?n1:n2];
        int i=n1-1;
        int j=n2-1;
        int k=sum.length-1;

        int c=0;

        while(k>=0){
            int d = c;

            if(i>=0){
                d+=A[i];
            }

            if(j>=0){
                d+=B[j];
            }

            c=d/10;
            d=d%10;

            sum[k]=d;

            i--;
            j--;
            k--;
        }

        if(c!=0){
            int[] ans = new int[(n1>n2?n1:n2) + 1];
            ans[0]=c;
             for (i = 0; i < ans.length-1; i++)
                ans[i+1] = sum[i];
  
            return ans;
        }
        return sum;
    }
}
