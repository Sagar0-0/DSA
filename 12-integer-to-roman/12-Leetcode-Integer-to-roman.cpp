class Solution {
public:
    string intToRoman(int num) {
        vector<pair<int, string>> vp{{1, "I"}, {4, "IV"}, {5, "V"}, {9, "IX"}, {10, "X"}, {40, "XL"}, {50, "L"}, {90, "XC"}, {100, "C"}, {400, "CD"}, {500, "D"}, {900, "CM"}, {1000, "M"}};
        string s = "";
        int j = vp.size() - 1;
        while(num != 0){            
            for(int i = j; i >= 0; i--){
                if(vp[i].first <= num){
                    s += vp[i].second;
                    num -= vp[i].first;
                    j = i;
                    break;
                }
            }
        }
        return s;
    }
};
