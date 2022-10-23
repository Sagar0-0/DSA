//{ Driver Code Starts
//Initial Template for Java


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
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            int  M = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            int ans = ob.steppingNumbers(N, M);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    int ans;
    int steppingNumbers(int n, int m){
        // code here
        ans=0;
        if(n==0)ans++;
        for(int i=1;i<=9;i++){
            dfs(i,n,m);
        }
        return ans;
    }
    void dfs(int curr,int n,int m){
        if(curr>m)return;
        if(curr>=n && curr<=m)ans++;
        int lastDigit=curr%10;
        if(lastDigit==0){
            dfs(curr*10+1,n,m);
        }else if(lastDigit==9){
            dfs(curr*10+8,n,m);
        }else{
            dfs(curr*10+(lastDigit-1),n,m);
            dfs(curr*10+(lastDigit+1),n,m);
        }
    }
}