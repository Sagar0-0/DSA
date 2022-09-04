public class Solution {
    public int solve(int[] A) {
        int ans=0;
        if(A.length%2==0)return ans;
        for(int i=0;i<A.length;i+=2){
            ans=ans^A[i];
        }
        return ans;
    }
}
