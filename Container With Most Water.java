public class Solution {
    public int maxArea(int[] A) {
        if(A.length<=1)return 0;
        int ans=Integer.MIN_VALUE;
        int i=0;
        int j=A.length-1;
        while(i<j){
            ans=Math.max(ans,(j-i)*Math.min(A[i],A[j]));
            if(A[i]<A[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
