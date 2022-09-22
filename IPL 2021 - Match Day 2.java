class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer>ans=new ArrayList<>();
        Deque<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            while(q.size()>0 && i-q.peek()>=k){
                q.removeFirst();
            }
            
            while(q.size()>0 && arr[q.getLast()]<=arr[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(i>=k-1)ans.add(arr[q.peek()]);
        }
        
        return ans;
    }
}
