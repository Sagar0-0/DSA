class Solution {
    public boolean search(int[] nums, int target) {
         int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return true;
            }
            //case: when all left right and mid are same
            else if(nums[left]==nums[mid] && nums[right]==nums[mid]){
                left++;
                right--;
            }
            //case: when mid is on higher level
            else if(nums[left]<=nums[mid]){
                //when left to mid is increasing
                if(nums[left]<=target && nums[mid]>target){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            //case: when mid is smaller than left
            else{
                //when mid to right is increasing
                if(nums[mid]<target && nums[right]>=target){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return false;
    }
}
