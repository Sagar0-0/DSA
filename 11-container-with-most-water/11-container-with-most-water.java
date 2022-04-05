class Solution {
    public int maxArea(int[] a) {
        int max=0;
        int i=0;
        int j=a.length-1;
        while(i<j){
            max=Math.max(max,area(a,i,j));
            if(a[i]<a[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
    public int area(int[]a,int i,int j){
        return Math.min(a[i],a[j])*(j-i);
    }
}