class Solution
{
    int time;
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        time=0;
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[]ap=new boolean[V];
        int[]parent=new int[V];
        boolean[]vis=new boolean[V];
        int[]minDis=new int[V];
        int[]dis=new int[V];
        Arrays.fill(parent,-1);
        for(int i=0;i<V;i++){
            dfs(i,ap,adj,parent,vis,minDis,dis);
        }
        for(int i=0;i<V;i++){
            if(ap[i]){
                ans.add(i);
            }
        }
        
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
    }
    void dfs(int u,boolean[]ap,ArrayList<ArrayList<Integer>> adj,int[]parent,boolean[]vis,
    int[]minDis,int[]dis){
        vis[u]=true;
        int children=0;
        dis[u]=minDis[u]=time;
        time++;
        for(int v:adj.get(u)){
            if(!vis[v]){
                children++;
                parent[v]=u;
                dfs(v,ap,adj,parent,vis,minDis,dis);
                minDis[u]=Math.min(minDis[u],minDis[v]);
                if(parent[u]==-1 && children>1){
                    ap[u]=true;
                }else if(parent[u]!=-1 && minDis[v]>=dis[u]){
                    ap[u]=true;
                }
            }else{
                minDis[u]=Math.min(minDis[u],dis[v]);
            }
        }
    }
}
