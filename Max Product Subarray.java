public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProduct(final int[] nums) {
        int length = nums.length;
        int result = nums[0];;
        int curr_max = nums[0];
        int curr_min = nums[0];
        for(int i =1; i < length; i++){
            int curr_max_prev= curr_max;
            curr_max = Math.max(nums[i], Math.max(curr_max*nums[i], curr_min*nums[i]));
            curr_min = Math.min(nums[i], Math.min(curr_max_prev*nums[i], curr_min*nums[i]));
            result = Math.max(result,curr_max);     
        }        
        return result;   
    }
}
