class Solution {
public:
    // bool isPowerOfThree(int n) {
    //     if(n < 1) return false;
    //     for(; n != 1; n /= 3) if(n % 3 != 0) return false;
    //     return true;
    // }
        
    bool isPowerOfThree(int n) {
	         return n > 0 && 1162261467 % n == 0;
	         // pow(3, floor(log(INT_MAX)/log(3))) = 1162261467 
    }
};
