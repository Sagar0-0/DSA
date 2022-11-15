public class Solution {
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> adj =  new ArrayList<>();
        boolean vis[] = new boolean[A+1];
        for(int i=0;i<=A;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(ArrayList<Integer> edge:B){
            adj.get(edge.get(0)).add(edge.get(1));
            adj.get(edge.get(1)).add(edge.get(0));
        }
        for(int i=1;i<=A;i++){
            if(vis[i]==false){
                if(dfs(adj,vis,i,-1))return 1;
            }
        }
        return 0;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean vis[],int node,int parent){
        vis[node] = true;
        for(int it:adj.get(node)){
            if(!vis[it]){
                if(dfs(adj,vis,it,node))return true;
            }else{
                if(it!=parent)return true;
            }
        }
        return false;
    }
}
