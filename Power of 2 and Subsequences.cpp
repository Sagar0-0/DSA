    int mod = 1e9 + 7;
    bool isPowerOfTwo(long long x){
        return x && (!(x & (x - 1)));
    }
    long long numberOfSubsequences(int N, long long A[]){
        // only numbers with power of 2 will give product as power of 2
        
        long long n = 0; // count of numbers of power of two in ans and 
    
        for(int i=0;i<N;i++){
            if(isPowerOfTwo(A[i])) n++;
        }
        
        int ans = 1;
        // our ans is nC1 + nC2 + ......... + nCn = 2^n - nC0 = 2^n - 1
        
        while(n--){
            ans = (ans * 2) % mod; //finding 2^n
        }
        return ans - 1; // 2^n - 1
    }
