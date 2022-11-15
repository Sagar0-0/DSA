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
            String input_line[] = read.readLine().trim().split("\\s+");
            long N = Long.parseLong(input_line[0]);
            Solution ob = new Solution();
            long ans = ob.killinSpree(N);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    long killinSpree(long n)
    {
        long low=1;
        long high=(long)Math.sqrt(n);
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            long sum=(mid*(mid+1)*(2*mid + 1))/6;
            if(sum==n)return mid;
            else if(sum<n){
                low=mid+1;
                ans=mid;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
