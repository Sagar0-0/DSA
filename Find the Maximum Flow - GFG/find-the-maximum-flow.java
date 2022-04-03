// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
    
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            
            ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
            input_line = read.readLine().trim().split("\\s+");
            for(int i=0;i<M;i++)
            {
                ArrayList<Integer> e = new ArrayList<Integer>();
                e.add(Integer.parseInt(input_line[3*i]));
                e.add(Integer.parseInt(input_line[3*i+1]));
                e.add(Integer.parseInt(input_line[3*i+2]));
                Edges.add(e);
            }
            Solution ob = new Solution();
            int ans = ob.solve(N, M, Edges); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int bfs(int[][] g,int[] p,int source,int sink,int n){
        int mn=Integer.MAX_VALUE;
        Arrays.fill(p,-1);
        boolean[] vis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        vis[source]=true;
        p[source]=-1;
        while(!q.isEmpty()){
            int u = q.remove();
            for(int v=0;v<n;v++){
                if(vis[v]==false && g[u][v]!=0){
                    if(v==sink){
                        p[v]=u;
                        mn = Math.min(mn,g[u][v]);
                        return mn;
                    }
                    q.add(v);
                    vis[v]=true;
                    mn=Math.min(mn,g[u][v]);
                    p[v]=u;
                }
            }
        }
        return 0;
    }
    int ford(int[][] g,int source,int sink,int n){
        int[] p=new int[n];
        Arrays.fill(p,-1);
        int res=0;
        while(bfs(g,p,source,sink,n)!=0){
            int mn = bfs(g,p,source,sink,n);
            res+=mn;
            int v= sink;
            while(v!=source){
                int u=p[v];
                g[u][v]-=mn;
                g[v][u]+=mn;
                v=p[v];
            }
        }
        return res;
    }
    int solve(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        // code here
        int g[][] = new int[N][N];
        for(int i=0;i<Edges.size();i++){
            int u = Edges.get(i).get(0)-1;
            int v = Edges.get(i).get(1)-1;
            int w = Edges.get(i).get(2);
            g[u][v]+=w;
            g[v][u]+=w;
        }
        return ford(g,0,N-1,N);
    }
}