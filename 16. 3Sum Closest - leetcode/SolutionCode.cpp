class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
        int closestSum = nums[0] + nums[1] + nums[2], n = nums.size();
        
        for(int i=0; i<n-2; i++){
            int left = i+1, right = n-1;
            while(left < right){
                int tmpSum = nums[i] + nums[left] + nums[right];
                int diff = abs(tmpSum - target);
                
                if(diff == 0) return tmpSum;
                if(tmpSum < target) left++;
                else right--;
                
                if(abs(closestSum - target) > diff) closestSum = tmpSum;
            }
        }
        
        return closestSum;
    }
};
