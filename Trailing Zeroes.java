public class Solution {
    public int solve(int A) {
        return (int) (Math.log(A&~(A-1))/Math.log(2));
    }
}
