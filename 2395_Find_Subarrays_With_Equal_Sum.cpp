class Solution {
public:
    bool findSubarrays(vector<int>& nums) {
        set<int> s;
        for(int i =0;i<nums.size()-1;i++){
            s.insert(nums[i]+nums[i+1]);
        }
        if(s.size()==nums.size()-1){
            return false;
        }
        return true;
    }
};
