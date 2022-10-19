class Solution{   
public:
    
    long long numberOfSubsequences(int N, long long A[]){
        // code here 
        long long ans = 0, MOD = 1e9+7;
        
        for(int i=0; i<N; i++)
        {
            long long temp = A[i];
            bool f = true;
            
            while(temp > 1)
            {
                if(temp%2)
                {
                    f = false;
                    break;
                }
                
                temp /= 2;
            }
            
            if(f)
            {
                ans *= 2;
                ans++;
                
                ans %= MOD;
            }
        }
        
        return ans;
    }
};
