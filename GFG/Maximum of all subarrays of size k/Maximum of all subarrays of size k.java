class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(q.size()>0 && q.peekLast()<arr[i]){
                q.removeLast();
            }
            q.addLast(arr[i]);
        }
        ArrayList<Integer> ans =new ArrayList<>();
        ans.add(q.peekFirst());
        int x=0;
        for(int i=k;i<n;i++){
            if(q.peekFirst()==arr[x]){
                q.removeFirst();
            }
            x++;
            while(q.size()>0 && q.peekLast()<arr[i]){
                q.removeLast();
            }
            q.addLast(arr[i]);
            
            ans.add(q.peekFirst());
        }
        return ans;
    }
}
