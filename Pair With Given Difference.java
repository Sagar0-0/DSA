public class Solution {
    public int solve(int[] A, int B) {
        int[] nums = A;
        Arrays.sort(nums);
        int low = 0;
        int high = 1;
        while(low<A.length && high<A.length){
            if(high!=low && nums[high] - nums[low] == B){
                return 1;
            }
            if(nums[high] - nums[low] > B){
                low++;
            } else high++;
        }
        return 0;
    }
}
