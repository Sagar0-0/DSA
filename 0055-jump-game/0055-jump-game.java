class Solution {
    public boolean canJump(int[] nums) {
        int maxReachableDistance=nums[0];
        int i=1;
        while(maxReachableDistance>=i && i<nums.length){
            maxReachableDistance=Math.max(maxReachableDistance,nums[i]+i);
            i++;
        }
        return maxReachableDistance>=nums.length-1;
        
    }
}