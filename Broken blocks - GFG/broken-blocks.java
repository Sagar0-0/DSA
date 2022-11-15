// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int m = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);
            int[][] matrix = new int[m][n];
            for(int i = 0; i < m; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            int ans = obj.MaxGold(matrix);
            System.out.println(ans);

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int[][]dp;
    public int MaxGold(int[][] a){
        int ans=0;
        dp=new int[a.length][a[0].length];
        for(int i=0;i<a[0].length;i++){
            ans=Math.max(ans,dfs(a,0,i));
        }
        return ans;
    }
    public int dfs(int[][]a,int i,int j){
        if(!valid(a,i,j))return 0;
        if(dp[i][j]!=0)return dp[i][j];
        int ans= a[i][j]+Math.max(dfs(a,i+1,j),Math.max(dfs(a,i+1,j-1),dfs(a,i+1,j+1)));
        dp[i][j]=ans;
        return ans;
    }
    public boolean valid(int[][]a,int i,int j){
        int n=a.length;
        int m=a[0].length;
        if(i<0 || j<0 || i==n || j==m || a[i][j]==-1)return false;
        return true;
    }
}