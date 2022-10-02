class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low=0, high=nums.size()-1, mid=0;
        while(mid<=high){
        if(nums[mid]==1){
         mid++;
        }
             else if(nums[mid]==0){
             swap(nums[low],nums[mid]);
                low++;
                mid++;
                
            }
            else if(nums[mid]==2){
                swap(nums[high],nums[mid]);
                high--;
             
            }
        }
        
    }
};
