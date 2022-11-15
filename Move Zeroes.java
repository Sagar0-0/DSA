public class Solution {
    public int[] solve(int[] A) {
        int cnt=0;
        for(int i:A){
            if(i==0)cnt++;
        }
        int pos=0;
        int i=0;
        while(i<A.length){
            if(A[i]!=0){
                A[pos]=A[i];
                pos++;
            }
            i++;
        }
        i--;
        while(cnt-->0){
            A[i--]=0;
        }
        return A;
    }
}
