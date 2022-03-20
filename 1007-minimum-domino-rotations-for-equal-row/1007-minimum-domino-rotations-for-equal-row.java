class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans =-1;
        for(int i=1;i<=6;i++){
            int currAns = helper(i,tops,bottoms);
            if (currAns != -1 && (ans == -1 || ans > currAns)) {
                ans = currAns;
            }
        }
        return ans;
    }
    
    private int helper(int target,int[] a,int[] b){
        int numswapA =0;
        int numswapB =0;
        for(int i=0;i<a.length;i++){
            if(a[i] != target && b[i] != target){
                return -1;
            }
            if(a[i] != target){
                numswapA++;
            } else if(b[i] != target){
                numswapB++;
            }
        }
        return Math.min(numswapA,numswapB);
    }
}