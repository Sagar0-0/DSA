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
            String s = br.readLine().trim();
            String []S = s.split(" ");
            int N = Integer.parseInt(S[0]);
            int start_x = Integer.parseInt(S[1]);
            int start_y = Integer.parseInt(S[2]);
            int step = Integer.parseInt(S[3]);
            Solution ob = new Solution();
            double ans = ob.findProb(N, start_x, start_y, step);
            System.out.println(String.format("%.6f", ans));           
        }
    }
}
// } Driver Code Ends


//User function Template for Java
// code starts

class Solution
{
    public static boolean isValid(int ni, int nj, int n){
      
      if(ni>=0 && nj>=0 && ni<n && nj<n){
          return true;
      }else{
          return false;
      }
    }
    public double findProb(int N, int start_x, int start_y, int step){
        double curr[][] = new double[N][N];
        double next[][] = new double[N][N];
 
        curr[start_x][start_y] = 1;
 
        for (int m = 1; m<=step; m++){
            for (int i = 0; i<N; i++){
                for (int j = 0; j<N; j++){
                    if(curr[i][j] != 0){
                        int ni = 0;
                        int nj = 0;
                        ni = i-2;
                        nj = j+1;
                        if(isValid(ni, nj, N)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }
                    
                        ni = i-1;
                        nj = j+2;
                        if(isValid(ni, nj, N)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }
                     
                         ni = i+1;
                         nj = j+2;
                         if(isValid(ni, nj, N)){
                             next[ni][nj] += curr[i][j]/8.0;
                         }
                         
                         ni = i+2;
                         nj = j+1;
                         if(isValid(ni, nj, N)){
                             next[ni][nj] += curr[i][j]/8.0;
                         }
                         
                         ni = i+2;
                         nj = j-1;
                         if(isValid(ni, nj, N)){
                             next[ni][nj] += curr[i][j]/8.0;
                         }
                         
                         ni = i+1;
                         nj = j-2;
                         if(isValid(ni, nj, N)){
                             next[ni][nj] += curr[i][j]/8.0;
                         }
                         
                         ni = i-1;
                         nj = j-2;
                         if(isValid(ni, nj, N)){
                             next[ni][nj] += curr[i][j]/8.0;
                         }
                         
                        ni = i-2;
                        nj = j-1;
                        if(isValid(ni, nj, N)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }
                     
                    }
                }
            }
           curr = next;
           next = new double[N][N];
         
         
        }
     
       double sum = 0;
       for (int i = 0; i<N; i++){
           for (int j = 0; j<N; j++){
               sum += curr[i][j];
           }
       }
       
       return sum;
   }
}