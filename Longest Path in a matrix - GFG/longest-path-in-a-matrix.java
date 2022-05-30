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
            String[] S1 = br.readLine().trim().split(" ");
            int n  = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    matrix[i][j] = Integer.parseInt(S2[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.longestIncreasingPath(matrix);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int[][]dp;
    int [][]arr;
    public int longestIncreasingPath(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        dp=new int[n][m];
        arr=matrix;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans=Math.max(ans,dfs(i,j));
            }
        }
        return ans;
    }
    public int dfs(int i,int j){
        if(valid(i,j)){
            if(dp[i][j]!=0){
                return dp[i][j];
            }
            int ans=0;        
            if(valid(i+1,j) && arr[i+1][j]>arr[i][j]){
                int curr=dfs(i+1,j);
                ans=Math.max(ans,curr);
            }
            if(valid(i-1,j) && arr[i-1][j]>arr[i][j]){
                int curr=dfs(i-1,j);
                ans=Math.max(ans,curr);
            }
            if(valid(i,j+1) && arr[i][j+1]>arr[i][j]){
                int curr=dfs(i,j+1);
                ans=Math.max(ans,curr);
            }
            if(valid(i,j-1) && arr[i][j-1]>arr[i][j]){
                int curr=dfs(i,j-1);
                ans=Math.max(ans,curr);
            }
            dp[i][j]=ans+1;
            return dp[i][j];
        }else{
            return 0;
        }
    }
    public boolean valid(int i,int j){
        int n=arr.length;
        int m=arr[0].length;
        if(i<0 || j<0 || i==n || j==m)return false;
        return true;
    }
}