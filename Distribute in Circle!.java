public class Solution {
    public int solve(int A, int B, int C) {
        A=A%B;
        C=C%B;
        while(A!=0){
            A--;
            C++;
        }
        return C%B-1;
    }
}
