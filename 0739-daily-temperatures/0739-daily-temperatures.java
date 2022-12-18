class Solution {
    public int[] dailyTemperatures(int[] a) {
        Deque<Integer> s=new ArrayDeque<>();
        int[]ans=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=0;
            }else{
                ans[i]=s.peek()-i;
            }
            s.push(i);
        }
        return ans;
    }
}