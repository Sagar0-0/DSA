public class Solution {
    public int solve(int n, int p, int q) {
        if ((((n & (1 << p-1)) >> p-1) ^ ((n & (1 << q-1)) >> q-1))!=0){
n ^= (1 << p-1);
n ^= (1 << q-1);
}


return n ;

    }
}
