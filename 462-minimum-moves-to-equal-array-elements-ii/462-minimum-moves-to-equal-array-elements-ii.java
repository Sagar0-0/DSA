class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int staps=0;
        while(i<j){
            staps+=(nums[j]-nums[i]);
            i++;
            j--;
        }
        return staps;
    }
}