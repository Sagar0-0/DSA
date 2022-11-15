public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] arr, int B) {
        int ans[]=new int[arr.length-B+1];
        int idx=0;
        if(arr.length==1){
            ans[0]=arr[0];
            return ans;
        }
        Deque<Integer> q=new ArrayDeque<>();
        int i;
        for(i=0;i<B;i++){
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        for(i=B;i<arr.length;i++){
            ans[idx]=arr[q.peekFirst()];
            idx++;
            while(!q.isEmpty() && q.peekFirst()<=i-B)q.removeFirst();
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()])q.removeLast();
            q.addLast(i);
        }
        ans[idx]=arr[q.peekFirst()];
        return ans;
    }
}
