// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.findMinInsertions(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    private static Integer[][] dp;
    private static int find(int l, int r, String s){
        if(l > r){
            return 0;
        }
        if(dp[l][r] != null){
            return dp[l][r];
        }
        
        if(s.charAt(l) == s.charAt(r)){
            return dp[l][r] = find(l+1, r-1, s);
        }else{
            return dp[l][r] = 1 + Math.min(find(l+1, r, s), find(l, r-1, s));
        }
    }
    
    int findMinInsertions(String S){
        dp = new Integer[S.length()][S.length()];    
        return find(0, S.length()-1, S);    
    }
}