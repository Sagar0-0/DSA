class Solution{
    public:
    long long numberOfSubsequences(int N, long long A[]){
   
        long long MOD = 1e9+7;
        
        long long t=0;
        
        for(int i=0 ; i<N ;i++)
        {
       
            if((A[i] & A[i]-1)==0)
            t++;
        }
    
        long long ans = 1;
        
        while(t--)
        ans = (ans*2)%MOD;
        
        if(t!=0)
        return ans-1;
        else
        return 0;
       
    }
 
};