class Solution
{
public:

    //defining mod
    long long MOD = 1000000007;
    
    int countFriendsPairings(int n) 
    { 
        //numbers less than 3 will have the same answer
        if(n < 3) return n;
        
        //defining and storing base conditions
        long long prev1 = 1;
        long long prev2 = 2;
        
        //using tabulation based on the pattern observed
        for(long long i = 3; i <= n; i++)
        {
            long long temp = prev2 % MOD;
            
            prev2 = (((((i-1) % MOD)*(prev1 % MOD))%MOD) + (prev2 % MOD))%MOD;
            prev1 = temp;
        }
        
        return prev2;
    }
};
