class Solution{
    static long nineDivisors(long N){
        //Code Here
        long ans=0;
        int size=(int)Math.sqrt(N);
        int prime[]=new int[size+1];
        for(int i=1;i<=size;i++){
            prime[i]=i;
        }
        
        //fill sieve
        for(int i=2;i*i<=size;i++){
            if(prime[i]==i){
                for(int j=i*i;j<=size;j+=i){
                    if(prime[j]==j){
                        prime[j]=i;
                    }
                }
            }
        }
        //check for root n
        for(int i=2;i<=size;i++){
            int p=prime[i];
            
            int q=prime[i/p];
            
            if((p!= q && p*q==i && q!=1) ||
            (prime[i]==i && Math.pow(i,8)<=N)){
                ans+=1;
            }
        }
        return ans;
    }
}
