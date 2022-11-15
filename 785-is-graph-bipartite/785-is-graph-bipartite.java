class Solution {
    public boolean isBipartite(int[][] graph) {
        boolean[]vis=new boolean[100];
        boolean[]color=new boolean[100];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(graph[i].length==0 || vis[i]){
                continue;
            }
            q.add(i);
            vis[i]=true;
            color[i]=true;
            while(!q.isEmpty()){
                int node=q.remove();
                for(int neb:graph[node]){
                    if(!vis[neb]){
                        q.add(neb);
                        vis[neb]=true;
                        color[neb]=!color[node];
                    }else if(color[neb]==color[node]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}