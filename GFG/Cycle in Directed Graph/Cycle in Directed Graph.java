public class Solution {
    public int solve(int vtces, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Edge>[] graph=new ArrayList[vtces];
        int edge=B.size();
        for(int i=0;i<vtces;i++){
            graph[i]=new ArrayList<>();
        }
        //make 0 base vertex
        for(int i=0;i<edge;i++){
           int v1=B.get(i).get(0);
           int v2=B.get(i).get(1);
           graph[v1-1].add(new Edge(v1-1,v2-1));
        }
        boolean [] visited=new boolean[vtces];
        for(int v=0;v<vtces;v++){
            if(visited[v]==false){
                boolean cycle=isCycle(graph,v,visited);
                if(cycle){
                    return 1;
                }
            }
        }
        return 0;

    }
    public static boolean isCycle(ArrayList<Edge> [] graph,int src,boolean[] visited){

        visited[src]=true;
        for(Edge e:graph[src]){
            if(visited[e.nbr]==false){
                isCycle(graph,e.nbr,visited);
            }else{
                return true;
            }
        }
        visited[src]=false;

        return false;
    }
}
class Edge{
    int src;
    int nbr;
    Edge(int src,int nbr){
        this.src=src;
        this.nbr=nbr;
    }
}
