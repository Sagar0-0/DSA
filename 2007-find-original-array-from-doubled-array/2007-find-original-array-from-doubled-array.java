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