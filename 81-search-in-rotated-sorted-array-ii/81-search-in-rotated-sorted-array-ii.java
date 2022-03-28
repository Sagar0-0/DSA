class Solution {
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        int l = 0;
        int h = len - 1;

        int mid;
        while(l <= h) {
            mid = (l + (h-l) / 2);
            if (nums[mid] == target) {
                return true;
            }
            if(!isHelpful(nums,l,mid)){
                l++;
                continue;
            }
            
            boolean midInFirst = inFirst(nums[l],nums[mid]);
            boolean tarInFirst = inFirst(nums[l],target);
            
            if(midInFirst^tarInFirst){//One in first and one in second
                if(midInFirst){
                    l = mid + 1;
                }else{
                    h = mid - 1;
                }
            }else {//both are in the first or both are in the second
                if (nums[mid] > target) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return false;
    }
    
    boolean isHelpful(int[] nums, int start, int midIdx){
        return nums[start] != nums[midIdx];
    }
    
    boolean inFirst(int startVal, int i){
        return startVal <= i;
    }
}