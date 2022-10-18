//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<>();
        int row=0;
        int col=0;
        while(col<N){
            int r=row;
            int c=col;
            while(r<N && c>=0){
                ans.add(A[r][c]);
                r++;
                c--;
            }
            col++;
        }
        col=N-1;
        row=1;
        while(row<N){
            int r=row;
            int c=col;
            while(r<N && c>=0){
                ans.add(A[r][c]);
                r++;
                c--;
            }
            row++;
        }
        return ans;
    }
}
