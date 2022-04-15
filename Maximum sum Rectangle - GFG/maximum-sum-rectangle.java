// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int kade(int[]sum){
        int max = Integer.MIN_VALUE;
        int cur=0;
        for(int i : sum){
            cur += i;
            if(cur > max){
                max = cur;
            }
            if(cur <0){
                cur = 0;
            }
        }
        return max;
    }
    
    int maximumSumRectangle(int r, int c, int mat[][]) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<r; i++){
            int[]sum = new int [c];
            
            for(int j=i; j<r; j++){
             
                for(int k=0; k<c; k++){
                    sum[k] += mat[j][k];
                }   
                
                max = Math.max(max, kade(sum));
            }
        }
        return max;
    }
};
/*
int max = Integer.MIN_VALUE;
        
        for(int i=0; i<r; i++){
            int[]sum = new int [c];
            
            for(int j=i; j<r; j++){
             
                for(int k=0; k<c; k++){
                    sum[k] += mat[j][k];
                }   
                
                max = Math.max(max, kade(sum));
            }
        }
        return max;
*/
