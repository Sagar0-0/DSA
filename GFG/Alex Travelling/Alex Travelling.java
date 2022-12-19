class Solution {
    class Pair{
        int node;
        int weight;
        Pair(int n,int w){
            node=n;
            weight=w;
        }
    }
    int minimumCost(int[][] flights, int n, int k) {
        // Your code here
        Map<Integer,ArrayList<Pair>> map=new HashMap<>();
        for(int[]i:flights){
            int u=i[0];
            int v=i[1];
            int w=i[2];
            map.putIfAbsent(u,new ArrayList<>());
            map.get(u).add(new Pair(v,w));
        }                    
        
        int[]dis=new int[n+1];
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(k,dis[k]));
        
        while(!q.isEmpty()){
            Pair curr=q.remove();
            int node=curr.node;
            int cost=curr.weight;
            if(!map.containsKey(node))continue;
            for(Pair p:map.get(node)){
                int neb=p.node;
                int nebCost=p.weight;
                if((dis[neb]==0 || dis[neb]>cost+nebCost) && neb!=k){
                    dis[neb]=cost+nebCost;
                    q.add(new Pair(neb,dis[neb]));
                }
            }
        }
        
        for(int i=1;i<dis.length;i++){
            if(dis[i]!=0){
                ans=Math.max(ans,dis[i]);
            }else if(i!=k){
                return -1;
            }
        }
        return ans;
    }
}
