

class Solution
{
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> adj, int S)
    {
        // Write your code here
        int[]distance=new int[V];
        Arrays.fill(distance,100000000);
        distance[S]=0;
        
        for(int i=1;i<V;i++){
            for(ArrayList<Integer> a:adj){
                int src=a.get(0);
                int des=a.get(1);
                int weight=a.get(2);
                if(distance[src] + weight < distance[des]){
                    distance[des]=distance[src] + weight;
                }
            }
        }
        return distance;
    }
}
