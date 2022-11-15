// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

 // } Driver Code Ends
//User function Template for Java

class Solution{
    static int subsetXOR(int arr[], int N, int K) { 
        int max_ele = arr[0]; 
        for (int i=1; i<N; i++) 
          if (arr[i] > max_ele) 
              max_ele = arr[i]; 
              
        int m = 10*max_ele;
            
        int[][] dp = new int[N+1][m+1];
        
        dp[0][0] = 1;
        
        for(int i=1;i<=N;i++){
            for(int j=0;j<=m;j++){
                dp[i][j] += dp[i-1][j]; 
                if((j^arr[i-1])<=m){
                    dp[i][j] += dp[i-1][j^arr[i-1]];
                }
            }
        }
        
        return dp[N][K]; 
    } 
}

// { Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0)
        {
            int N = s.nextInt();
            int K = s.nextInt();
            int arr[] = new int[N];
            for(int i =0;i<N;i++)
            {
                arr[i] =s.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.subsetXOR(arr,N,K));
        }
    }
}  // } Driver Code Ends