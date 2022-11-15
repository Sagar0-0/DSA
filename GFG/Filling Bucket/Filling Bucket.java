class Solution {
    static int fillingBucket(int N) {
        // code here
        if(N==1)return 1;
        int prev=2;
        int secPrev=1;
        int mod=100000000;
        for(int i=0;i<N-2;i++){
            int currAns=(prev%mod+secPrev%mod)%mod;
            secPrev=prev;
            prev=currAns;
        }
        return prev;
    }
};
