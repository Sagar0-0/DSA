#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> sumEvenAfterQueries(vector<int>& nums, vector<vector<int>>& queries) {
        int S =0;
        for(auto x : nums)
            if(x%2==0) S+=x;
        
        vector<int>res;
        
        for(auto q : queries ){
            int val = q[0], idx = q[1];
//             if original nums[idx] is even, then we deduct it from evenSum
            if(nums[idx] % 2==0) S-=nums[idx];
//             in-place update nums
            nums[idx]+=val;
//             check if we need to update evenSum for the new value
            if (nums[idx] % 2 == 0) S += nums[idx];
//             then we have evenSum after this query, push it to ans 
            res.push_back(S);

        }
        return res;
    }
};