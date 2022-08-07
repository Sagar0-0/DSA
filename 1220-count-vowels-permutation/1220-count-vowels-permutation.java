class Solution {
    int mod=1000000007;
    public int countVowelPermutation(int n) {
        int[] f=new int[5];
        for(int i=0;i<5;i++){
            f[i]=1;
        }
        for(int i=1;i<n;i++){
            int f0=((f[1]+f[2])%mod+f[4])%mod;
            int f1=(f[0]+f[2])%mod;
            int f2=(f[1]+f[3])%mod;
            int f3=f[2];
            int f4=(f[2]+f[3])%mod;
            f[0]=f0;
            f[1]=f1;
            f[2]=f2;
            f[3]=f3;
            f[4]=f4;
        }
        int result=0;
        for(int i=0;i<5;i++){
            result=(result+f[i])%mod;
        }
        return result;
    }
}