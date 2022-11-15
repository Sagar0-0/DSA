public class Solution {
    public int solve(int A, int B) {
        int topLeft=Math.min(A-1,B-1);
        int topRight=Math.min(A-1,8-B);
        int botLeft=Math.min(8-A,B-1);
        int botRight=Math.min(8-A,8-B);
        return topLeft+topRight+botLeft+botRight;
    }
}
