
class Solution {
    long maxGcd(int N) {
        // code here
        return Math.max(solve(N),solve(N-1));
    }
    long solve(int n){
        long ans=n;
        int added=0;
        for(int i=n-1;i>=1;i--){
            if(gcd(ans,i)==1L){
                ans*=i;
                added++;
            }
            if(added==3)return ans;
        }
        return ans;
    }
    long gcd(long a,long b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    
}
