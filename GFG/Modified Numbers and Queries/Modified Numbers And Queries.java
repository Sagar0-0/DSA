class Solution
{
    public int sumOfAll(int l, int r)
    {
        // code here
        int f[]=new int[r+1];
        int ans=0;
        if(l<=1) ans+=1;
        for(int i=2;i<=r;i++) {
            if(f[i]==0) {
                for(int j=i;j<=r;j+=i) {
                    f[j]+=i;
                }
            }
            if(i>=l) {
                if(f[i]==0) ans+=i;
                else ans+=f[i];
            }
        }
        return ans;
    }
}
