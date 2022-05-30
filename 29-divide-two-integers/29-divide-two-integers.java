class Solution {
    
    // 19 / 3 = 6 = 3 * (2^2 + 2^1)
    public int divide(int dividend, int divisor) {
        // record the sign
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);
        long res = 0;
        while (longDividend >= longDivisor) {
            long tmpDivisor = longDivisor;
            long tmpMul = 1;
            while (longDividend >= (tmpDivisor << 1)) {
                tmpDivisor <<= 1;
                tmpMul <<=1;
            }
            longDividend -= tmpDivisor;
            res += tmpMul;
        }
        res *= sign;
        if (res >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) res;
    }
}