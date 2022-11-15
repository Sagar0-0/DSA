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
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.TotalCount(str);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    public int TotalCount(String str){
        int sum = 0;
        for(int i=0; i<str.length();i++){
            sum += str.charAt(i) - '0';
        }
        int[][]dp =new int[sum+1][str.length()+1];
        for(int[]i : dp){
            Arrays.fill(i,-1);
        }
        return backtrack(str, sum, str.length()-1, dp);
    }
    public int backtrack(String str, int currsum, int index, int[][]dp){
        if(index<0)return 1;
        
        int curr = 0;
        int ans = 0;
        
        if(dp[currsum][index]!=-1)return dp[currsum][index];
        
        for(int i=index;i>=0;i--){
            curr += str.charAt(i)-'0';
            if(curr<=currsum)ans += backtrack(str,curr,i-1, dp);
        }
        return dp[currsum][index] = ans;
    }
}