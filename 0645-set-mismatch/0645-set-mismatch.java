class Solution {
    public int[] findErrorNums(int[] nums) {
        /** Assume m is the missing and d is the duplicate element
         diff= m-d;
         squareDiff= m^2-d^2;
         sum=m+d= squareDiff/diff
         =>sum    = (m+d)(m-d)/(m-d);
         now m=(sum+diff)2;
         and d= (sum-diff)2;
        **/
        int diff=0;
        int sqaureDiff=0;
        for(int i=0;i<nums.length;i++){
            /** 
            The order doesnot matter. keep adding the 1 to n and simultaneously subracting  corresponding array element.
            Use i+1 to get 1 to n  since i is the index number which is zero based.
            **/
            diff+=(i+1)-nums[i];
            /** squareDiff is also calculated in the same way as diff is calculated. **/
            sqaureDiff+= (i+1)*(i+1)-nums[i]*nums[i];
        } 
       int sum=sqaureDiff/diff;
      return new int[]{(sum-diff)/2,(sum+diff)/2};
    }
}