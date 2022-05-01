public class Solution {
    public int solve(int A) {
        String s=Integer.toString(A);
        int product=1;
        for(char c:s.toCharArray()){
            product*=(c-48);
        }
        return product;
    }
}
