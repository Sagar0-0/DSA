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
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int[] X = new int[N];
            int[] Y = new int[N];
            
            for(int i=0; i<N; i++)
            {
                X[i] = Integer.parseInt(S1[i]);
                Y[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.numOfPairs(X,Y,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
   public int numOfPairs(int[] x, int[] y, int n) {
       // code here
       HashMap<Integer, Integer> xCount = new HashMap<>();
       HashMap<Integer, Integer> yCount = new HashMap<>();
       HashMap<ArrayList<Integer>, Integer> visited = new HashMap<>();
       int ans = 0;
       int count1 = 0;
       int count2 = 0;
       int count3 = 0;

       for (int i = 0; i < n; ++i) {
           count1 += xCount.getOrDefault(x[i], 0);
           xCount.put(x[i], xCount.getOrDefault(x[i], 0) + 1);
       }
       
       for (int i = 0; i < n; ++i) {
           count2 += yCount.getOrDefault(y[i], 0);
           yCount.put(y[i], yCount.getOrDefault(y[i], 0) + 1);
       }
       
       for (int i = 0; i < n; ++i) {
           ArrayList<Integer> current = new ArrayList<>(Arrays.asList(x[i], y[i]));
           count3 += visited.getOrDefault(current, 0);
           visited.put(current, visited.getOrDefault(current, 0) + 1);
       }
       
       ans = count1 + count2 - 2 * count3;
       
       return ans;
   }
};