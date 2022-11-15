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
            String S = br.readLine().trim();
            String[] S1 = S.split(" ");
            int n = Integer.parseInt(S1[0]);
            int amount  = Integer.parseInt(S1[1]);
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.MinCoin(nums, amount);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int MinCoin(int[] nums, int amount){
        
        int n = nums.length;
        
        int dp[] = new int[amount+1];
        
        for(int i=1; i<=amount; i++){
            dp[i] = 100000;
            for(int j=0; j<n; j++){
                if(i>=nums[j] && dp[i-nums[j]]!=-1){
                    dp[i] = Math.min(dp[i],  dp[i-nums[j]] + 1);
                }
            }
            if(dp[i]>=100000)dp[i]=-1;
        }
        return dp[amount];
    }
}