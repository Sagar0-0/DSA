class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();
            adj.add(list);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        
        int[] vis=new int[n];
        int[] dfsVis=new int[n];
        int[] check=new int[n];
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(adj,i,vis,dfsVis,check);
            }
        }
        
        for(int i=0;i<n;i++){
            if(check[i]==1) ans.add(i);
        }
        
        return ans;
    }
    
    public boolean dfs(List<List<Integer>> adj,int node,int[] vis,int[] dfsVis,int[] check){
        vis[node]=1;
        dfsVis[node]=1;
        
        for(int e:adj.get(node)){
            if(vis[e]==0){
                if(dfs(adj,e,vis,dfsVis,check)){
                    check[node]=0;
                    return true;
                }
            }
            if(dfsVis[e]==1){
                check[node]=0;
                return true;
            }
        }
        dfsVis[node]=0;
        check[node]=1;
        return false;
    }
}
