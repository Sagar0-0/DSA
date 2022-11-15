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
            int q = Integer.parseInt(br.readLine().trim());
            int[][] Query = new int[q][2];
            for(int i = 0; i < q; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < 2; j++){
                    Query[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.SolveQueris(str, Query);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   public int[] SolveQueris(String str, int[][] Query)
   {
       Set<Character> set = new HashSet<>();
       int a[]= new int[Query.length];
       for(int i=0;i<Query.length;i++){
           set.clear();
           for(int j=Query[i][0]-1;j<Query[i][1];j++){
               set.add(str.charAt(j));
           }
           a[i]=set.size();
       }
       return a;
   }
}