class Solution{
    private static final int mod = 1000000007;
    private static int reset;
    private static Integer[][] dp;
    
    private static int find(int N, int K){
        if(N == 0){
            return 1;
        }
        if(dp[N][K] != null) return dp[N][K];
        
        int count = 0;
        
        for(char c = 'a'; c <= 'z'; c++){
            if(c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                if(K > 0){
                    count = (count + find(N-1, K-1)) % mod;
                }
            }
            else{
                count = (count + find(N-1, reset)) % mod;
            }
        }
        
        return dp[N][K] = count;
    }
    
    
    
    public int kvowelwords(int N,int K){
        dp = new Integer[N+1][K+1];
        reset = K;
        return find(N, K);
    }
}
