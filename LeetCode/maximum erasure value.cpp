class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        set<int> st;
        int start=0;
        int end=0;
        int ans=nums[0];
        vector<int> sum;
        sum.push_back(nums[0]);
        for(int i=1;i<nums.size();i++){
            sum.push_back(sum.back()+nums[i]);
        }
        while(start<nums.size() and end<nums.size()){
            auto it  = st.find(nums[end]);
            if(it == st.end()){
                ans=max((ans),(sum[end]-sum[start]+nums[start]));
                st.insert(nums[end]);
                end++;
            }
            else{
                st.erase(nums[start]);
                start++;
            }
        }
        return ans;
    }
};
