// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.math.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(sc.next());
            
            String s[] = new String[n];
            for(int i=0;i<n;i++)
            {
                s[i] = sc.next();
            }
            Solution T = new Solution();
            System.out.println(T.lcp(s,n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String lcp(String s[],int n){
        Arrays.sort(s,(a,b)->a.length()-b.length());
        String ans=s[0];
        for(int i=1;i<s.length;i++){
            StringBuilder curr=new StringBuilder();
            for(int j=0;j<ans.length();j++){
                if(ans.charAt(j)==s[i].charAt(j)){
                    curr.append(ans.charAt(j));
                }
            }
            ans=curr.toString();
        }
        if(ans.length()==0)ans="-1";
        return ans;
    }
}
