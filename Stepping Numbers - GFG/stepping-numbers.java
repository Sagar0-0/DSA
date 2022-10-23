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
    int steppingNumbers(int n, int m){
        // code here
        int ans=0;
        if(n==0)ans++;
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=9;i++){
            q.add(i);
        }
        while(q.size()>0){
            int sz=q.size();
            while(sz-->0){
                int ele=q.remove();
                if(ele>=n && ele<=m)ans++;
                int lastDigit=ele%10;
                if(lastDigit==9){
                    int next=ele*10+8;
                    if(next<=m)q.add(next);
                }else if(lastDigit==0){
                    int next=ele*10+1;
                    if(next<=m)q.add(next);
                }else{
                    int smaller=ele*10+(lastDigit-1);
                    if(smaller<=m)q.add(smaller);
                    int greater=ele*10+(lastDigit+1);
                    if(greater<=m)q.add(greater);
                }
            }
        }
        return ans;
    }
}
