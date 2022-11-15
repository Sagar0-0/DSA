long long numberOfSubsequences(int N, long long A[]){
         int mod=1e9+7;
             long long count=0;
             for(int i=0;i<N;i++){
                 if((A[i]&A[i]-1)==0){
                     count++;
                 }
             }
             long long res=1;
             for(int i=0;i<count;i++){
                 res=(res*2)%mod;
             }
        return res-1;
    }