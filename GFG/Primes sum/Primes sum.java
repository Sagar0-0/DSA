class Solution {
    static String isSumOfTwo(int N){
        // code here
        boolean[]primes=new boolean[N];
        Arrays.fill(primes,true);
        
        for(int i=2;i*i<=N;i++){
            if(primes[i]){
                for(int j=i*i;j<N;j+=i){
                    primes[j]=false;
                }
            }
        }
        
        for(int i=2;i<=N/2;i++){
            if(primes[i] && primes[N-i]){
                return "Yes";
            }
        }
        return "No";
    }
}
