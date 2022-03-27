public class Solution {
    public int perfectPeak(int[] A) {
        int n=A.length;
        int[] maxArr=new int[n];
        int[] minArr=new int[n];
        maxArr[0]=A[0];
        for(int i=1;i<n;i++){
            maxArr[i]=Math.max(A[i],maxArr[i-1]);
        }
        minArr[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--){
            minArr[i]=Math.min(A[i],minArr[i+1]);
        }
        for(int i=1;i<n-1;i++){
            if(A[i]>maxArr[i-1] && A[i]<minArr[i+1]){
                return 1;
            }
        }
        return 0;
    }
}
