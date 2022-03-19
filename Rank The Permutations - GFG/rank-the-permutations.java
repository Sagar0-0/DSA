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
            Solution obj = new Solution();
            long ans = obj.findRank(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findRank(String s){
        // Code here
        if(s.length()==0){
            return 0;
        }
        long  res=1;
        for(int i=0; i<s.length()-1; i++){
            long cou=0;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) > s.charAt(j)){
                    cou++;
                }
            }
            res += cou * fact(s.length()-1-i);
        }
        return res;
    }
    long fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }
}