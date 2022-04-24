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
            String a[] = in.readLine().trim().split("\\s+");
            long L = Long.parseLong(a[0]);
            long R = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(L, R));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int mod=1000000007;
    static long primeProduct(long L, long R){
       // code here
       long ans=1;
       for(long i=L;i<=R;i++){
           if(isPrime(i)){
               ans=(ans%mod*i)%mod;
           }
       }
       return ans;
    }
    static boolean isPrime(long n){
        if(n<=1)
            return false;
        if(n==2)
            return true;
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}