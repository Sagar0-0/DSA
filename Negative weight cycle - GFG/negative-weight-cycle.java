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
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] edges = new int[m][3];
            for(int i = 0; i < m; i++){
                String S2[] = br.readLine().trim().split(" ");
                for(int j = 0; j < 3; j++)
                    edges[i][j] = Integer.parseInt(S2[j]);
            }
            Solution obj = new Solution();
            int ans = obj.isNegativeWeightCycle(n, edges);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int isNegativeWeightCycle(int n, int[][] edges){
        if (edges == null || n == 0) {
            return 0;
        }
        int [] distance = new int [n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        // n - 1 number of relaxation steps
        for (int i = 1; i <= n - 1; i++) {
            for (int [] edge : edges) {
                int source = edge[0];
                int destination = edge[1];
                int weight = edge[2];
                // condition
                if (distance[source] != Integer.MAX_VALUE) {
                    distance[destination] =Math.min(distance[destination], distance[source] + weight);
                }
            }
        }
        // relaxation step once more to make sure about the negative cycle
        for (int [] edge : edges) {
            int source = edge[0];
            int destination = edge[1];
            int weight = edge[2];
            if (distance[source] != Integer.MAX_VALUE && distance[source] + 
            weight < distance[destination]) {
                // there is a negative cycle as distance will get updated
                return 1;
            }
        }
        return 0;
    }
}