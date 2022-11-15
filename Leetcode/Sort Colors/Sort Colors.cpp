class Solution {
public:
    void sortColors(vector<int>& nums) {
        if(nums.size() == 0) return;
            int i=0, j=0, k = nums.size()-1;
            while(j<=k) {
                    if(nums[j] == 2) {
                            swap(nums[j], nums[k]);  k--;
                    }
                    if(nums[j] == 0) {
                            swap(nums[j], nums[i]);  i++; j++;
                    }else if(nums[j] == 1) {
                            j++;
                    }
            }
    }
};