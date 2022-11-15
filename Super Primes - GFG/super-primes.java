// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.superPrimes(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int superPrimes(int n) {
        boolean [] primes=new boolean[n+1];
        Arrays.fill(primes,true);
        
        //performing sieve
        for(int i=2;i<=Math.sqrt(n);i++){
            if(primes[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    primes[j]=false;
                }
            }
        }
        int count=0;
        for(int i=5;i<=n;i++){
            if(primes[i] && primes[i-2]){
                count++;
            }
        }
        return count;
    }
}