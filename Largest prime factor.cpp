class Solution{
public: 
bool isPrime(int N){
    for(int i=2;i<=sqrt(N); i++){
        if(N % i==0) return false;
    }
    return true;
}
    long long int largestPrimeFactor(int N){
        if(isPrime(N)) return N;
        long long int ans = 0;
        
        for(long long int i=N-1;i>=2;i--){
            if(N%i==0 && isPrime(i)) return i;
            // else cout<<i<<" ";
        }
        
    }
};
