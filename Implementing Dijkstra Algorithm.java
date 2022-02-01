class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // distance of all numbers from source
        int[] distance=new int[V];
        //currently we don't know so filling maximum distance
        for(int i=0;i<V;i++){
            distance[i]=Integer.MAX_VALUE;
        }
        //ditance to source will be 0
        distance[S]=0;
        
        //boolean array to check if already a number is selected or not and also to reduce time
        boolean[] selected=new boolean[V];
        
        //priority queue to always give smallest distance from one number
        Queue<ArrayList<Integer>> pq=new PriorityQueue<>(
            new Comparator<ArrayList<Integer>>(){
                @Override
                public int compare(ArrayList<Integer> a1,ArrayList<Integer> a2){
                    return a1.get(0)-a2.get(0);
                }
            }
        );
        //adding first pair into our priority queue
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0);
        a.add(S);
        pq.add(a);
        while(!pq.isEmpty()){
            //getting the smallest distance in pq
            ArrayList<Integer> arr=pq.remove();
            int currDistance=arr.get(0);
            int number=arr.get(1);
            //if that number was not already traversed then do it
            if(!selected[number]){
                //get all connected pairs for that particular number
                ArrayList<ArrayList<Integer>> connecteds=adj.get(number);
                for(int i=0;i<connecteds.size();i++){
                    int connectedNumber=connecteds.get(i).get(0);
                    int newDistance=connecteds.get(i).get(1)+currDistance;
                    //if new distance to some number is smaller than the stored one
                    if(newDistance<distance[connectedNumber]){
                        distance[connectedNumber]=newDistance;
                        ArrayList<Integer> newList=new ArrayList<>();
                        newList.add(newDistance);
                        newList.add(connectedNumber);
                        pq.add(newList);
                    }
                }
                //mark the number as selected
                selected[number]=true;
            }
        }
        return distance;
    }
}




=======================================================================================================================================
    
//without using arraylist and comparator ::
    
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // distance of all numbers from source
        int[] distance=new int[V];
        //currently we don't know so filling maximum distance
        Arrays.fill(distance,Integer.MAX_VALUE);
        
        //ditance to source will be 0
        distance[S]=0;
        
        //boolean array to check if already a number is selected or not and also to reduce time
        // boolean[] selected=new boolean[V];
        
        //priority queue to always give smallest distance from one number
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(S);
        
        while(!pq.isEmpty()){
            //getting the element from pq
            int number=pq.remove();
            int currDistance=distance[number];
            //get all connected pairs for that particular number
            ArrayList<ArrayList<Integer>> connecteds=adj.get(number);
            for(int i=0;i<connecteds.size();i++){
                int connectedNumber=connecteds.get(i).get(0);
                int newDistance=connecteds.get(i).get(1)+currDistance;
                //if new distance to some number is smaller than the stored one
                if(newDistance<distance[connectedNumber]){
                    distance[connectedNumber]=newDistance;
                    pq.add(connectedNumber);
                }
            }
        }
        return distance;
    }
}
