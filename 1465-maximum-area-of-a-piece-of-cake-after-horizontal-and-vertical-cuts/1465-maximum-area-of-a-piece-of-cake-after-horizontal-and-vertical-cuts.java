class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        return (int)((getMax(h,hc)*getMax(w,vc))%1000000007);
    }
    public long getMax(int len,int[] cuts){
        Arrays.sort(cuts);
        long from=0,max=0;
        for(int c:cuts){
            max=Math.max(max,c-from);
            from=c;
        }
        return Math.max(max,len-from);
    }
}