//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fillingBucket(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int fillingBucket(int N) {
        // code here
        if(N==1)return 1;
        int prev=2;
        int secPrev=1;
        int mod=100000000;
        for(int i=0;i<N-2;i++){
            int currAns=(prev%mod+secPrev%mod)%mod;
            secPrev=prev;
            prev=currAns;
        }
        return prev;
    }
};