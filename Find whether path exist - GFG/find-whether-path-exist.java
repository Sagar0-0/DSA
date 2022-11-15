// { Driver Code Starts
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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}// } Driver Code Ends




class Solution
{
    boolean res=false;
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    bfs(grid,vis,i,j);
                    return res;
                }
            }
        }
        return res;
    }
    public void bfs(int[][]a,boolean[][]vis,int i,int j){
        if(res)return;
        if(!valid(a,vis,i,j))return;
        if(a[i][j]==2){
            res=true;
            return;
        }
        vis[i][j]=true;
        bfs(a,vis,i+1,j);
        bfs(a,vis,i-1,j);
        bfs(a,vis,i,j+1);
        bfs(a,vis,i,j-1);
    }
    public boolean valid(int[][]a,boolean[][]vis,int i,int j){
        int n=a.length;
        int m=a[0].length;
        if(i<0 || j<0)return false;
        if(i==n || j==m)return false;
        if(vis[i][j])return false;
        if(a[i][j]==0)return false;
        return true;
    }
}