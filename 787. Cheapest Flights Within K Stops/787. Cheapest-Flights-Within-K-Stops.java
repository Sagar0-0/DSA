class Node{
    int v;
    int wt;
    Node(int a,int b){
        v=a;
        wt=b;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k){
        ArrayList<ArrayList<Node>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Node>());
        }
        
        for(int i=0;i<flights.length;i++){
            adj.get(flights[i][0]).add(new Node(flights[i][1],flights[i][2]));
        }
        
        
        Queue<int[]> que=new LinkedList<>();
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        que.add(new int[]{0,src,0});
    
        while(que.size()>0){
            int[] r=que.peek();
            que.remove();
            int stops=r[0];
            int node=r[1];
            int cost=r[2];
            
            if(stops > k) continue;
            for(Node it:adj.get(node)){
                int newV = it.v;
                int newWt = it.wt + cost;
                
                if(newWt < dist[newV] && stops<=k){
                    dist[newV] = newWt;
                    que.add(new int[]{stops+1,newV,dist[newV]});
                }
            
            }
        }
        
        return (dist[dst]==Integer.MAX_VALUE)?-1:dist[dst];
    }
}                                   
                                       
                                       
