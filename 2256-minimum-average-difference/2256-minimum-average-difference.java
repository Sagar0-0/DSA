class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long left=0;
        long right=0;
        long minDiff=Integer.MAX_VALUE;
        int idx=-1;
        for(int i:nums)right+=i;
        for(int i=0;i<n;i++){
            left+=nums[i];
            right-=nums[i];
            int leftEle=i+1;
            int rightEle=n-leftEle;
            if(rightEle==0)rightEle=1;
            long currDiff=Math.abs((left/leftEle)-(right/rightEle));
            if(currDiff<minDiff){
                minDiff=currDiff;
                idx=i;
            }
        }
        return idx;
    }
}