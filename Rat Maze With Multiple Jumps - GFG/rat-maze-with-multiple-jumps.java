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
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int[][] ans = ob.ShortestDistance(matrix);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int[][] ShortestDistance(int[][] matrix){
        // Code here
        int m= matrix.length;
        int n= matrix[0].length;
        
        if(matrix[0][0]==0 && n!=1){
	        int ans[][]={{-1}};
            return ans;
	    }
	    int ans[][] = new int[m][n];
        if(solver(matrix, ans,0,0)==false){
            ans[0][0]=-1;
            return ans;
        }
        return ans;
    }
    
    public boolean solver(int[][] matrix,int[][] ans,int i,int j){
        if(i==matrix.length-1 && j==matrix[0].length-1){
            ans[i][j]=1;
            return true;
        }
        if(isValid(i,j,matrix)){
            ans[i][j] = 1;
            for(int k=1;k<=matrix[i][j] && k<matrix.length;k++){
                if(solver(matrix,ans,i,j+k)) return true;
                if(solver(matrix,ans,i+k,j)) return true;
            }
            ans[i][j]=0;
            return false;
        }
        return false;
    }
    
    public boolean isValid(int x,int y,int[][] matrix){
        if(x>=matrix.length || y>=matrix[0].length||matrix[x][y]==0){
            return false;
        }
        return true;
    }
}