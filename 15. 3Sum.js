// https://leetcode.com/problems/3sum/

// ======> Question <=========
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].

// Soution in javascript

var threeSum = function(nums) {
    nums.sort((a,b)=>a-b);
    let res = []
    for(let i=0;i<nums.length-2;i++){
        if(nums[i]>0) break;
        if(i>0 && nums[i]===nums[i-1]) continue;
        let left=i+1;
        let right=nums.length-1;
        while(left<right){
            let sum = nums[i]+nums[left]+nums[right]
            if(sum<0) left++
            else if(sum>0) right--
            else{
            res.push([nums[i],nums[left],nums[right]])
            while(left<right && nums[left]===nums[left+1]) left++
            while(left<right && nums[right]===nums[right-1]) right--
            left++
            right--
            }
        }
    }
    return res
};

// Time complexity => O(n2) 
