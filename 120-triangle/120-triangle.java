class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        int sz=list.size();
        if(sz==1)
            return list.get(0).get(0);
        int dp[]=new int[sz+1];
        for(int row=sz-1;row>=0;row--)
        {
            int len=list.get(row).size();
            for(int col=0;col<len;col++)
            {
                dp[col]=Math.min(dp[col],dp[col+1])+list.get(row).get(col);
            }
        }
        return dp[0];
    }
}