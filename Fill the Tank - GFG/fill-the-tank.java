// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int S = Integer.parseInt(input_line[1]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int cap[] = new int[N];
            for(int i=0;i<N;i++){
                cap[i] = Integer.parseInt(input_line1[i]);
            }
            int Edges[][] = new int[N-1][2];
            for(int i=0;i<N-1;i++){
                String input_line2[] = read.readLine().trim().split("\\s+");
                Edges[i][0] = Integer.parseInt(input_line2[0]);
                Edges[i][1] = Integer.parseInt(input_line2[1]);
            }
            Solution ob = new Solution();
            long ans = ob.minimum_amount(Edges, N, S, cap);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends

class Solution
{
    long minimum_amount(int [][]Edges, int N, int S, int []cap)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=N; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<Edges.length; i++){
            adj.get(Edges[i][0]).add(Edges[i][1]);
            adj.get(Edges[i][1]).add(Edges[i][0]);
        }
        boolean[] visited = new boolean[N+1];
        long ans = ans(adj,S,cap,visited);
        return visited[0] ? -1 : ans;
    }
    long ans(ArrayList<ArrayList<Integer>> adj, int s, int[] cap, boolean[] visited){
        long res = -1;
        visited[s] = true;
        int sz = 0;
        for(int x: adj.get(s)){
            if(visited[x])continue;
            sz++;
            long cur = ans(adj,x,cap,visited);
            if(cur>10E17) visited[0] = true;
            res = Math.max(res,cur);
        }
        long curAns = res*sz + cap[s-1];
        if(curAns>10E17) visited[0] = true;
        return curAns;
    }
}
