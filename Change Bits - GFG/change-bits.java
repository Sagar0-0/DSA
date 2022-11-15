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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            int[] ans = ob.changeBits(N);
            System.out.println(ans[0]+ " "+ ans[1]);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] changeBits(int N) {
        int newNum=0;
        int n=N;
        while(n>0){
            newNum|=1;
            newNum=newNum<<=1;
            n=n>>1;
        }
        newNum=newNum>>1;
        int diff=Math.abs(N-newNum);
        int ans[]=new int[]{diff,newNum};
        return ans;
    }
};