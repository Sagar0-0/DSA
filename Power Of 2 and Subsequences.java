class Solution{
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        // code here
        int cnt=0;
        long mod=1000000007l;
        for(Long i:A){
            if((i&(i-1))==0){
                cnt++;
            }
        }
        return (long)(Math.pow(2,cnt)%mod-1)%mod;
    }
}
