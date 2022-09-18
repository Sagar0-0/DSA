#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
//         using 2 pointers tech
        int i =0, j = height.size()-1, res =0, maxi =0, mini =0;
        
//         pointer i from left and j from right
        while(i <=j){
//             take mini ht
            mini = min(height[i], height[j]);
//             find max, min ht
            maxi = max(maxi, mini);
            
//             unit of water being tapped is diff betn max_ht & min_ht
            res += maxi - mini;
//             move pointer i if ht[i] is smaller
            if(height[i] < height[j]) i++;
//             else move ptr j
            else j--;
        }
        return res;
//         TC: O(N), SC:O(1)
    }
};