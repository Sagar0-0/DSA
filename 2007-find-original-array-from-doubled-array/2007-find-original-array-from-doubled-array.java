/**
    Solution:
    
    1. Sort the array
    2. Make the queue
    3. Now we know that the answer array is half size of the change array
    4. Now traverse the change array and if queue is not empty and curr element is same as queue.peek then 
    add the half of num/2 to ans
    5. else add that 2*num to queue
    
    TC: O(n) SC:O(n)
*/


class Solution {
    public int[] findOriginalArray(int[] c) {
        
        int n=c.length;
        Deque<Integer> q=new LinkedList<>();
        Arrays.sort(c);
        
        int i=0;
        int j=0;
        int[] ans=new int[n/2];
        
        while(i<n){
            int num=c[i];
            if(q.size()>0 && q.peek()==num){
                ans[j++]=q.poll()/2;
            }else{
                q.add(2*num);
            }
            i++;
        }
        
        return q.size()>0?new int[]{}:ans;
        
    }
}
