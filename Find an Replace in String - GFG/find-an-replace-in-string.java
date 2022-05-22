// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            int Q = Integer.parseInt(read.readLine());
            
            int[] index = new int[Q];
            String[] sources = new String[Q];
            String[] targets = new String[Q];
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            String S3[] = read.readLine().split(" ");
            
            for(int i=0 ; i<Q ; i++) {
                index[i] = Integer.parseInt(S1[i]);
                sources[i] = S2[i];
                targets[i] = S3[i];
            }

            Solution ob = new Solution();
            System.out.println(ob.findAndReplace(S,Q,index,sources,targets));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String findAndReplace(String s, int q, int[] ind, String[] src, String[] tar) {
        // code here
        String ans = "";
        int last = 0;
        for(int i=0;i<q;i++){
            ans += s.substring(last,ind[i]);
            last = ind[i];
            if(src[i].equals(s.substring(ind[i],ind[i]+src[i].length()))){
                ans += tar[i];
                last += src[i].length();
            }
        }
        ans += s.substring(last);
        return ans;
    }
};