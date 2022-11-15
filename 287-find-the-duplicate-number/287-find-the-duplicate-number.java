class Solution {
    public int findDuplicate(int[] nums) {
        int fast=0,slow=0;
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast)break;
        }
        int slow2=0;
        while(true){
            slow=nums[slow];
            slow2=nums[slow2];
            if(slow==slow2)break;
        }
        return slow;
    }
}