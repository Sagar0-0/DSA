// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int M = Integer.parseInt(a[1]);
            int mat[][] = new int[M][2];
            for(int i = 0;i < M;i++){
                String a1[] = in.readLine().trim().split("\\s+");
                mat[i][0] = Integer.parseInt(a1[0]);
                mat[i][1] = Integer.parseInt(a1[1]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minColour(N, M, mat));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minColour(int N, int M, int mat[][]) {
        Queue<Integer> q = new LinkedList<>();
        int[] indegree = new int[N+1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=N;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] row : mat){
            indegree[row[0]]++;
            adj.get(row[1]).add(row[0]);
        }
        
        for(int i=0;i<=N;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        
        
        int count = 0;
        
        
        while(!q.isEmpty()){
            count++;
            int size = q.size();
            while(size-->0){
                int currVertex = q.poll();
                for(int neighbor : adj.get(currVertex)){
                    if(indegree[neighbor] == 1){
                        q.offer(neighbor);
                    }
                    indegree[neighbor]--;
                }
            }
        }
        
        return count;
    }
}