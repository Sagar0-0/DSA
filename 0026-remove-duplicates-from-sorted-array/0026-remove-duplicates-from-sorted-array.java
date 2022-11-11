class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=0;
        int i=0;
        while(i<nums.length-1){
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                i++;
            }
            nums[idx]=nums[i];
            idx++;
            i++;
        }
        if(i==nums.length)return idx;
        nums[idx]=nums[i];
        return idx+1;
    }
}