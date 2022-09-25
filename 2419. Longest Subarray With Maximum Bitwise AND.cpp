class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int maxEle = *max_element(nums.begin(), nums.end());
        int maxLen = INT_MIN;
        int count = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i] == maxEle){
                count++;
                maxLen = max(maxLen, count);
            }else{
                count = 0;
            }
        }
        return maxLen;
    }
};
