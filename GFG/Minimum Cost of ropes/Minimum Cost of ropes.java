class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        long cost = 0;
        if(n < 2){
            return cost;
        }
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
        }
        while(true){
            long first = pq.peek();
            pq.remove();
            long second = pq.peek();
            pq.remove();
            long temp = first + second;
            cost = cost + temp;
            if(pq.isEmpty()){
                break;
            }
            pq.add(temp);
        }
        return cost;
    }
}
