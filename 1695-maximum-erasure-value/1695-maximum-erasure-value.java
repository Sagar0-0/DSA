class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int i=0;
        int j=1;
        int ans=0;
        int sum=nums[i];
        Set<Integer> set=new HashSet<>();
        set.add(nums[i]);
        while(j<n){
            int ele=nums[j];
            if(!set.contains(ele)){
                set.add(ele);
                sum+=ele;
                j++;
            }else{
                while(set.contains(ele)){
                    set.remove(nums[i]);
                    sum-=nums[i];
                    i++;
                }
                set.add(ele);
                sum+=ele;
                j++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}