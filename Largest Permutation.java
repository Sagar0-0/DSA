public class Solution {
    public int[] solve(int[] A, int B) {
        int len = A.length;
        int position[] = new int[len+1];
        for (int i=0; i<len; i++){
            position[A[i]] = i;
        }
        for (int i=0; i<len && B>0; i++){
            if (A[i]!=len-i){
                A[position[len-i]] = A[i];
                int temp = position[A[i]];
                position[A[i]] = position[len-i];
                A[i] = len-i;
                B--;
            }
        }
        return A;
    }
}
