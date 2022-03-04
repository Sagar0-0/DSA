public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int x=A[0];
        int y=B[0];
        int count=0;
        for(int i=1;i<A.length;i++){
            if(x!=A[i] || y!=B[i]){
                count+=getDistance(x,y,A[i],B[i]);
                x=A[i];
                y=B[i];
            }
        }
        return count;
    }
    int getDistance(int x1, int y1, int x2, int y2) {
        return Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
    }
}
