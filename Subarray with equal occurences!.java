public class Solution {
    public int solve(int[] A, int B, int C) {
        int ans=0;
        for(int i=0;i<A.length;i++){
            int cntB=0;
            int cntC=0;
            for(int j=i;j<A.length;j++){
                if(A[j]==B){
                    cntB++;
                }else if(A[j]==C){
                    cntC++;
                }
                if(cntB==cntC){
                    ans++;
                }
            }
        }
        return ans;
    }
}
