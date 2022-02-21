class Solution {

public int majorityElement(int[] nums) {
        return recurse(nums, 0);
    }
    
    public int recurse(int[] nums, int start){
        int n = nums.length;
        int tracker= 1;
        for(int i=start+1;i<n;i++){
            if(nums[start]==nums[i]){
                tracker++;
            }else{
                tracker--;
            }
            if(tracker==0){
                return recurse(nums, i+1);
            }
        }
        return nums[start];
    }
}
