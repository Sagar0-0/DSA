class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> list = new HashMap();
        for(int i=0; i<nums.length; i++)
        {
            if(list.containsKey(nums[i]))
            {
                if(i-list.get(nums[i])<=k)
                {
                    return true;
                }
            }
            list.put(nums[i], i);
        }
        return false;
    }
}