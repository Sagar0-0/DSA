class Solution {
public:
    bool reorderedPowerOf2(int n) {
        string res = to_string(n);
        sort(res.begin(), res.end());
        for(int i =0; i<30; i++){
            string res1 = to_string(1<<i);
            sort(res1.begin(), res1.end());
            if(res == res1) return true;
        }
        return false;
    }
};