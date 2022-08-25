class Solution {
public:
    bool check(vector<int>& nums) {
        
        int size = nums.size();
        int count = 0;

        for(int x=0; x<size; x++)
        {   
            if(nums[x] > nums[(x+1)%size])
                count ++;
        }
        return (count <= 1);
        
        // in case of sorted and rotated array the count is 1 and in case of only sorted array the count is 0
        // in case of non-sorted and non-rotated array the count is greater than 1 so false.
    }
};
