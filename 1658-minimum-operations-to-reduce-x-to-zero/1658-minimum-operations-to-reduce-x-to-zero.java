class Solution {
    // class Solution {
    public int minOperations(int[] nums, int x) {
        int current = 0;
        for (int num : nums) {
            current += num;
        }
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < n; right++) {
            current -= nums[right];
            while (current < x && left <= right) {
                current += nums[left];
                left += 1;
            }
            if (current == x) {
                mini = Math.min(mini, (n-1-right)+left);
            }
        }
        return mini != Integer.MAX_VALUE ? mini : -1;
    }
}