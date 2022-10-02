class Solution
{
    public int Count(int L, int R)
    {
        // code here
        int primes=0;
        int comp=0;
        boolean[]prime=new boolean[R+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<=R;i++){
            if(prime[i]){
                for(int j=2*i;j<=R;j+=i){
                    prime[j]=false;
                }    
            }
        }
        
        for(int i=L;i<=R;i++){
            if(prime[i]){
                primes++;
            }else{
                comp++;
            }
        }
        if(L==1){
            comp--;
        }
        return comp-primes;
    }
}
