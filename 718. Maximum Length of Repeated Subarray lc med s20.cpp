#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int findLength(vector<int>& nums1, vector<int>& nums2) {
        //         dp space optmized
        int n = nums1.size(), m = nums2.size(), res = 0;
//         swap to ensure n >m
        if(n<m){
            swap(nums1, nums2);
            swap(n,m);
        }
//         dp records curr dp states
//         dp2 records the prev dp states
        vector<int> dp(n+1), dp2(n+1);
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=m; j++){
                if(nums1[i-1] == nums2[j-1]){
//                     extend from the prev dp state
                    dp[j] = dp2[j-1]+1;
                    
                }else
//                     reset to 0
                    dp[j] =0;
//             record the max len
            res = max(res, dp[j]);
            }
//             the curr state now becomes the prev state for nxt round
            dp2 = dp;
            
        }
        return res;
    }
};