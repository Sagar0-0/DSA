class Solution {
    public int[] countBits(int n) {
        int[]ans=new int[n+1];
        for(int i=1;i<ans.length;i++)
            ans[i]=ans[i>>1]+(i&1);
        return ans;
    }
}
