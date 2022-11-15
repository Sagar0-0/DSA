class Solution {
    public int largestRectangleArea(int[] a) {
        int max=0;
        int ps[]=prevSmallest(a);
        int ns[]=nextSmallest(a);
        for(int i=0;i<a.length;i++){
            int cur=(ns[i]-ps[i]-1)*a[i];
            max=Math.max(max,cur);
        }
        return max;
        
    }
    public int[] prevSmallest(int[]a){
        int ps[]=new int[a.length];
        Deque<Integer> s=new ArrayDeque<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    public int[] nextSmallest(int[]a){
        int ns[]=new int[a.length];
        Deque<Integer> s=new ArrayDeque<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i]=a.length;
            }else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }
}
