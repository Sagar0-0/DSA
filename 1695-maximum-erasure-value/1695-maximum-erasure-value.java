class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int i=0;
        int j=1;
        int ans=0;
        Set<Integer> set=new HashSet<>();
        set.add(nums[i]);
        while(j<n){
            int ele=nums[j];
            if(!set.contains(ele)){
                set.add(ele);
                j++;
            }else{
                while(set.contains(ele)){
                    set.remove(nums[i]);
                    i++;
                }
                set.add(ele);
                j++;
            }
            ans=Math.max(ans,sum(nums,i,j));
        }
        return ans;
    }
    public int sum(int[]nums,int i,int j){
        if(i==j)return nums[i];
        int res=0;
        while(i<j){
            res+=nums[i];
            i++;
        }
        return res;
    }
}