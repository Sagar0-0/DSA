class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = n - 1;
            
            while(start < end) {
                
                int sum = nums[i] + nums[start] + nums[end];
                
                if(sum == target) {
                    return sum;
                } 
            
                int diff = Math.abs(target - sum);
            
                if(diff < minDiff) {
                    minDiff = diff;
                    result = sum;
                }
            
                if(sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        
        return result;
    }
}