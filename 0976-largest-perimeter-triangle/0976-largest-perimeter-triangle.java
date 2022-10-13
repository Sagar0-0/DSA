class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        while(i>1){
            int a=nums[i];
            int b=nums[i-1];
            int c=nums[i-2];
            if(c+b>a){
                return a+b+c;
            }else{
                i--;
            }
        }
        return 0;
    }
}