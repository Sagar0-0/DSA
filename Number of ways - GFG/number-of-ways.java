// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            System.out.println(ob.arrangeTiles(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static long arrangeTiles(int n){
        // code here
        if(n<4)return 1;
        int four=n/4;
        long sum=0;
        for(int i=1;i<=four;i++){
            int rem=n-4*i;
            sum=sum+nCr(rem+i,i);
        }

        return sum+1;
    }
  
    static  long nCr(int n,int r){
        long sum=1;
        int max=Math.max(r,n-r);
       int min=Math.min(r,n-r);
       int st=1;
       for(int i=n;i>max;i--){
           sum= sum*i;
           sum/=st;
           st++;
       }
       return sum;
    }
}