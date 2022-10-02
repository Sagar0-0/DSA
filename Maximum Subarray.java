// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
// A subarray is a contiguous part of an array.
// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.
// Example 2:
// Input: nums = [1]
// Output: 1
// Example 3:
// Input: nums = [5,4,-1,7,8]
// Output: 23


//Code Below.

class Solution {
    public int maxSubArray(int[] a) {
        int i,n=a.length;
        int sum=0,maxsum=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            sum=sum+a[i];
            if(sum > maxsum) maxsum=sum;
            if(sum < 0) sum=0;
        }
        return maxsum;
    }
}
