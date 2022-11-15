class Solution{
    static long mod = 1000000007;
    long[][] multiply(long [][]m1, long[][]m2){
        long ans[][] =new long[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<2;k++)
                    ans[i][j] += (m1[i][k]*m2[k][j])%mod;
        return ans;
    }
    
    long[][] matPow(long [][]mat,long n){
        if(n == 1)return mat;
        long[][] ans = matPow(mat,n/2);
        ans = multiply(ans,ans);
        if((n&1) == 1)ans = multiply(ans,mat);
        return ans;
    }
    
    public int fib(int N){
       long n = N;
       if(n==1 || n==0)return N;
       long mat[][] = {{1,1},{1,0}};
       mat = matPow(mat,n-1);
       return (int) (mat[0][0]%mod);
    }
}