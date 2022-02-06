class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                if(count<2){
                    i++;
                    nums[i]=nums[j];
                    count++;
                }
            }else{
                i++;
                count=1;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}



====================================================================================
  
//faster
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[count] != nums[i] || (count-1<0 || nums[count-1] != nums[i])){
                nums[++count] = nums[i];
            } 
        }
        return count+1;
    }
}
