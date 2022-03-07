public class Solution {
    public int[] prevSmaller(int[] A) {
        int n=A.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=findMin(A,i);
        }
        return ans;
    }
    public int findMin(int[]a,int index){
        int i=index;
        while(i>=0){
            if(a[i]<a[index]){
                return a[i];
            }
            i--;
        }
        return -1;
    }
}
