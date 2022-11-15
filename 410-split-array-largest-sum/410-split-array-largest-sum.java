class Solution {
    public int splitArray(int[] nums, int m) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // search range [max, sum];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }
        int left = max;
        int right = sum;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, m, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
       // if (canSplit(nums, m, right)) return right;
        return left;
    }
    private boolean canSplit(int[] nums, int m, int largest) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > largest) {
                count++;
                sum = nums[i];
            }
        }
        return count <= m;
    }
}