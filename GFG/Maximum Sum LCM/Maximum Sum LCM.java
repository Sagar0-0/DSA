//User function Template for Java
class Solution {
    static long maxSumLCM(int n) {
        // code here
        long ans=0;
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                ans+=i;
                if(n/i!=i)ans+=(n/i);
            }
        }
        return ans;
    }
}
