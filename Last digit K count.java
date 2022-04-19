public class Solution {
    public int solve(int A, int B, int C) {
        while((A%10)!=C && A<B){
            A++;
        }
        while((B%10)!=C && B>A){
            B--;
        }
        if(A==B && A%10!=C)return 0;
        return (B-A)/10+1;
    }

}
