public class Solution {
    public int[] solve(int[] A) {
        int n=A.length;
        int[]ans=new int[n];
        int i=0;
        for(int num:A){
            if(num!=0){
                ans[i]=num;
                i++;
            }
        }
        return ans;
    }
}
