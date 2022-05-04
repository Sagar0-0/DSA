public class Solution {
    public int solve(int n) {
        int ans=0;
        for(int i=3;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                for(int k=j+1;k<=n;k++){
                    if(isTriplet(i,j,k))ans++;
                }
            }
        }
        return ans;
    }

    public boolean isTriplet(int a,int b,int c){
        return (a*a)+(b*b)==c*c;
    }
}
