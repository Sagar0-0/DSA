class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length); 
        Arrays.sort(nums);
        return (nums[nums.length >> 1] + nums[(nums.length - 1) >> 1]) / 2.0;
    }
}