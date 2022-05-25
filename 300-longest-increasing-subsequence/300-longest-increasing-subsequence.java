class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int[] memo = new int[nums.length];
        int i = 1;
        memo[0] = nums[0];
        int count = 0;
        while(i < nums.length){
            if(memo[count] < nums[i]){
                memo[count + 1] = nums[i];
                count++;
            }else{
                if(memo[0] >= nums[i]){
                    memo[0] = nums[i];
                }else{
                    int j = count;
                    while(j > -1 && memo[j] >= nums[i]){
                        j--;
                    }
                    if(j > -1){
                        memo[j + 1] = nums[i];
                    }
                } 
            }
            i++;
        }
        return count + 1;
    }
}    
