class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean[]vis=new boolean[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                count++;
                dfs(vis,adj,i,V);
            }
        }
        return count;
    }
    static void dfs(boolean[]vis,ArrayList<ArrayList<Integer>> adj,int curr,int V){
        vis[curr]=true;
        
        for(int i=0;i<V;i++){
            if(!vis[i] && adj.get(curr).get(i)==1){
                dfs(vis,adj,i,V);
            }
        }
    }
};
