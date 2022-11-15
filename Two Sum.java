class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        for (i=1;i<nums.length;i++)
        {
            for (j=i;j<nums.length;j++)
            {
                if (nums[j-i]+nums[j]==target)
                {
                    return new int[]{j-i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
