class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int[] distance=new int[V];
        for(int i=0;i<V;i++){
            distance[i]=Integer.MAX_VALUE;
        }
        distance[S]=0;
        
        boolean[] selected=new boolean[V];
        
        Queue<ArrayList<Integer>> pq=new PriorityQueue<>(
            new Comparator<ArrayList<Integer>>(){
                @Override
                public int compare(ArrayList<Integer> a1,ArrayList<Integer> a2){
                    return a1.get(0)-a2.get(0);
                }
            }
            );
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0);
        a.add(S);
        pq.add(a);
        while(!pq.isEmpty()){
            ArrayList<Integer> arr=pq.remove();
            int number=arr.get(1);
            int currDistance=arr.get(0);
            ArrayList<ArrayList<Integer>> connecteds=adj.get(number);
            for(int i=0;i<connecteds.size();i++){
                int connectedNumber=connecteds.get(i).get(0);
                int newDistance=connecteds.get(i).get(1)+currDistance;
                if(newDistance<distance[connectedNumber]){
                    distance[connectedNumber]=newDistance;
                    ArrayList<Integer> newList=new ArrayList<>();
                    newList.add(newDistance);
                    newList.add(connectedNumber);
                    pq.add(newList);
                }
            }    
        }
        return distance;
    }
}
