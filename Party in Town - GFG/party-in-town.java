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
            int N = Integer.parseInt(in.readLine());
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
    		for(int i = 0;i < N+1;i++){
    	        ArrayList<Integer> arr = new ArrayList<Integer>();
    	        adj.add(arr);
    		}
    		for(int i = 0;i < N-1;i++){
    		    String a[] = in.readLine().trim().split("\\s+");
    		    int x = Integer.parseInt(a[0]);
    		    int y = Integer.parseInt(a[1]);
    		    adj.get(x).add(y);
    		    adj.get(y).add(x);
    		}
    		
    		Solution ob = new Solution();
    		System.out.println(ob.partyHouse(N, adj));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
   static int dfs(ArrayList<ArrayList<Integer>> adj, int start, boolean[]visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
               int val = q.remove();
               visited[val] = true;
               for(int i : adj.get(val)){
                   if(visited[i]==false){
                       q.add(i);
                   }
               }
           }
           level++;
       }
       return level-1;
   }
   static int partyHouse(int N, ArrayList<ArrayList<Integer>> adj)
   {
       int ans = Integer.MAX_VALUE;
       for(int i=1; i<=N;i++){
           boolean[]visited = new boolean[N+1];
           ans = Math.min(ans, dfs(adj, i,visited));    
       }    
       return ans;
   }
}