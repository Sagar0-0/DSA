// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int p[] = new int[n];
            for(int i = 0;i < n;i++)
                p[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixChainOrder(p, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static char matrix;
    static String ans;
    static String matrixChainOrder(int p[], int n){
        // code here
        matrix='A';
        ans="";
        int[][]dp=new int[n][n];
        int[][]path=new int[n][n];
        for(int pair=2;pair<n;pair++){
            for(int i=1;i<=n-pair;i++){
                int j=i+pair-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int temp= dp[i][k]+dp[k+1][j]+ p[i-1]*p[k]*p[j];
                    if(temp<dp[i][j]){
                        dp[i][j]=temp;
                        path[i][j]=k;
                    }
                }
            }
        }
        dfs(1,n-1,path);
        return ans;
    }
    static void dfs(int i,int j,int[][]path){
        if(i==j){
            ans+=matrix;
            matrix++;
            return;
        }
        ans+='(';
        dfs(i,path[i][j],path);
        dfs(path[i][j]+1,j,path);
        ans+=')';
    }
}