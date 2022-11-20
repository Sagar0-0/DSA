class Solution {
    long lcmTriplets(long N) {
        // code here
        if(N<=2)return N;
        if((N&1)==1)return N*(N-1)*(N-2);
        if(N%3==0)return (N-1)*(N-3)*(N-2);
        return N*(N-1)*(N-3);
    }
}
