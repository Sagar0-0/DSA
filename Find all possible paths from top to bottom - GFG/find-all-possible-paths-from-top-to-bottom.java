// { Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 2);
            
            
            int[][] grid = IntMatrix.input(br, a[0], a[1]);
            
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> res = obj.findAllPossiblePaths(a[0],a[1], grid);
            
            IntMatrix.print(res);
            
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n,int m, int[][] grid) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        int i=0;
        int j=0;
        curr.add(grid[0][0]);
        dfs(ans,curr,i,j,grid);
        return ans;
    }
    static void dfs(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer>curr,int i,int j,int[][]grid){
        if(i==grid.length-1 && j==grid[0].length-1){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        
        if(valid(i+1,j,grid)){
            curr.add(grid[i+1][j]);
            dfs(ans,curr,i+1,j,grid);
            curr.remove(curr.size()-1);
        }
        if(valid(i,j+1,grid)){
            curr.add(grid[i][j+1]);
            dfs(ans,curr,i,j+1,grid);
            curr.remove(curr.size()-1);
        }
    }
    static boolean valid(int i,int j,int[][]grid){
        if(i==grid.length || j==grid[0].length)return false;
        return true;
    }
}
        
