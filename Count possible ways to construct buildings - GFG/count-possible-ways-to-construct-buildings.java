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
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   public int TotalWays(int N)
   {
       // Code here
       long i,ans=0,inf = 1000000007;
       long s = 1,b=1;
       
       while(N-->1){
           i = s%inf;
           s = (s%inf+b%inf);
           b = i;
       }
       s = s%inf + b%inf;
       return (int)((s*s)%inf);
   }

}