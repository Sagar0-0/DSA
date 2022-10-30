class Solution
{
    public long NoOfChicks(int N)
    {
        // Code here
        long[]dp=new long[N+1];//new born
        dp[1]=1;
        long total=1;
        for(int i=2;i<=N;i++){
            if(i>6){
                total-=dp[i-6];
            }
            dp[i]=total*2;
            total+=(total*2);
        }
        return total;
    }
}
