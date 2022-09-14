#include<bits/stdc++.h>
using namespace std;
// TC : O(N) where N is the number of elements in data
// SC: O(1) 
class Solution {
public:
    bool validUtf8(vector<int>& data) {
        int remaining = 0;
        for (auto& x : data) {
            if (remaining == 0) {
                if ((x >> 5) == 0b110) {
                    remaining = 1;
                } else if ((x >> 4) == 0b1110) {
                     remaining = 2;
                } else if ((x >> 3) == 0b11110) {
                    remaining = 3;
                } else if ((x >> 7) != 0) {
                    return false;
                }
            } else {
                if ((x >> 6) != 0b10) return false;
                else remaining--;
            }
        }
        return remaining == 0;
    }
};
