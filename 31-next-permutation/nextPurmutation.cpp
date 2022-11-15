/*
Approach: 
There may be three possibilities for the given sequence, it could be in ascending, descending or mixed Order.
Based upon that three subcases will be applied
1. Descending Order : For this we simply need to return a series in acending order i.e. a Sorted Array
2. Ascending Order : By just swapping last two unequal numbers of array, we could get a Required next Permutation.
3. Mixed Order : For this we need to find the right most local maxima, after that is find further two cases may arise: 
      i) If a number exists in right of this local maxima which is less than this maxima and greater than element before maxima(let say that as midVal)
          In that cases swapping midVal with element just before local maxima will give, next premutaion, as that would be more close.
      ii) In case if no such Element Exists, in that case directly swapping local maxima with element before than will be right.
      
 After doing any of i or ii, we need to sort remainning right array in ascending order.     

*/

// Code : 

class Solution {
public:
int findIfMidExists(vector<int>& nums, int t){
    int ans = -1;
    for(int i=t+1;i<nums.size();i++){
        if(nums[i]<nums[t] &&  nums[i]>nums[t-1]){
            ans = i;
        }
    }
    return ans;
}    
    void nextPermutation(vector<int>& nums) {
        if(nums.size()==1) return ;
        if(nums.size()==2){
            swap(nums[0], nums[1]);
            return;
        }
        int n = nums.size(), mx = n-1, i=n-1;
        for(;i>=0;i--){
            if(i==n-1 && nums[i]>nums[i-1]){ 
                mx = n-1;
                break;}
            else if(i>0 && nums[i]>nums[i-1] && nums[i]>=nums[i+1]){ 
                mx = i;
                break;
            }
        }
      // If Given series is in descending Order
        if(i<0){
            sort(nums.begin(), nums.end());
            return;
        }
        
        int midVal = findIfMidExists(nums,mx);
        if(midVal != -1){
            swap(nums[mx-1], nums[midVal]);
            sort(nums.begin()+mx, nums.end());
            return;
        }
        swap(nums[mx-1], nums[mx]);
        sort(nums.begin() + mx, nums.end());
    }
};
