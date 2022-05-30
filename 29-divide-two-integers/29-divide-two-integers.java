class Solution {
    public int divide(int dividend, int divisor) {
    //the special situation
        if (dividend == 0) {
          return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
          return Integer.MAX_VALUE;
        }
        //mark the different situation
        boolean sign = true;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            sign = false;
        }
        //change them both into negative number
        dividend = dividend > 0 ? -dividend : dividend;
        divisor = divisor > 0 ? -divisor : divisor;
        //if there are different,so it must be a negative number,just 0 minus the result
        return sign == false ? 0 - count(dividend, divisor) : count(dividend, divisor);
     }

  /**
   * This recursion main code is while,it just likes optimization of subtraction
   */
      private int count(int a, int b) {
        //if 3*n==7 just plus 1,or 3*n>7 just plus 0
        if (a >= b) {
          return a > b ? 0 : 1;
        }
        //the default number is 1,and 2,4,8...doubling
        int n = 1;
        int result = 0;
        int temp = b;
        while (a <= temp && temp < 0) {
          a -= temp;
          result += n;
          temp += temp;
          n += n;
        }
        return result + count(a, b);
      }
}