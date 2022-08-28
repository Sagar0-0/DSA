class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {                
        unordered_map<int, int> mp;
        int sum=0, ans=0;
        mp[sum] = 1; // we always have one subarray with sum 0
        for(auto it : nums){
            sum += it; // prefix sum 
            if(mp.find(sum - k) != mp.end()) ans += mp[sum - k];
            mp[sum]++;
        }
        return ans;
    }
};
