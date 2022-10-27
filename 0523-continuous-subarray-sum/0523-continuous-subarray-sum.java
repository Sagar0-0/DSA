class Solution 
{
    public boolean checkSubarraySum(int[] nums, int k) 
    {
        int prefixSum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++)
        {
            prefixSum += nums[i];
            
            // this is the twist
            if (k != 0)
            {
                prefixSum = prefixSum % k;  //whose elements sum up to a multiple of k
            }
            
            // this is general
            if (map.containsKey(prefixSum))
            {
                //  if nums has a continuous subarray of size at least two elements
                if (i - map.get(prefixSum) > 1)  
                {
                    return true;
                }
            }
            else
            {
                map.put(prefixSum, i);  // adding the index
            }
        }
        return false;
    }
}