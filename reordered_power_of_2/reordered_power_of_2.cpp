class Solution {
public:
    bool reorderedPowerOf2(int n) {
        
        // idea is to check if each digit of n is equal to any of the digit of power of 2 from power 0 to power 29
        // because 2^30 is greater than 10^9.
        // we can check either making strings or storing digits in vector and checking if vectors are same at any point.
        
        string s = to_string(n);
        sort(s.begin(), s.end());
        for(int i=0;i<30;i++){
            string t = to_string(1<<i);
            sort(t.begin(), t.end());
            if(s==t) return true;
        }
        return false;
    }
};
