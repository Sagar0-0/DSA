// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

 // } Driver Code Ends
//User function Template for Java
class Pair
{
    int x, y, u_left, d_left;
    
    Pair(int x, int y, int u_left, int d_left)
    {
        this.x = x;
        this.y = y;
        this.u_left = u_left;
        this.d_left = d_left;
    }
}


class Solution
{
    
    private static boolean isValid(int x, int y, boolean visited[][], char mat[][], int n, int m)
    {
        if(x<0 || x>=n || y<0 || y>=m || visited[x][y]==true || mat[x][y]=='#') return false;
        else return true;
    }
    

	public static int numberOfCells(int n, int m, int r, int c, int u, int d, char mat[][])
	{
	    Queue<Pair> queue = new ArrayDeque<>();
	    
	    boolean visited[][] = new boolean[n][m];
	    
	    queue.offer(new Pair(r, c, u, d));
	    
	    visited[r][c] = true;
	    
	    if(mat[r][c]=='#') return 0;
	    
	    int total_count = 1;
	    
	    while(!queue.isEmpty())
	    {
	        Pair p = queue.poll();
	        
	        
	        if(isValid(p.x, p.y+1, visited, mat, n, m))
	        {
	            total_count++;
	            visited[p.x][p.y+1] = true;
	            queue.offer(new Pair(p.x, p.y+1, p.u_left, p.d_left));
	        }
	        
	        if(isValid(p.x, p.y-1, visited, mat, n, m))
	        {
	            total_count++;
	            visited[p.x][p.y-1] = true;
	            queue.offer(new Pair(p.x, p.y-1, p.u_left, p.d_left));
	        }
	        
	        if(p.d_left>0 && isValid(p.x+1, p.y, visited, mat, n, m))
	        {
	            total_count++;
	            visited[p.x+1][p.y] = true;
	            queue.offer(new Pair(p.x+1, p.y, p.u_left, p.d_left-1));
	        }
	        
	        if(p.u_left>0 && isValid(p.x-1, p.y, visited, mat, n, m))
	        {
	            total_count++;
	            visited[p.x-1][p.y] = true;
	            queue.offer(new Pair(p.x-1, p.y, p.u_left-1, p.d_left));
	        }
	        
	    }
	    
	    return total_count;
		
	}

}


// { Driver Code Starts.

public class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
		{
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int r = sc.nextInt();
		    int c = sc.nextInt();
		    int u = sc.nextInt();
		    int d = sc.nextInt();
		    
		    char mat[][] = new char[n][m];

            for(int i = 0; i < n; i++)
            {
                String s = sc.next();
                for(int j = 0; j < m; j++)
                {
                    mat[i][j] = s.charAt(j);
                }
            }
            
            Solution obj = new Solution();
            System.out.println(obj.numberOfCells(n, m, r, c, u, d, mat));
		    
		}
	}
}

  // } Driver Code Ends