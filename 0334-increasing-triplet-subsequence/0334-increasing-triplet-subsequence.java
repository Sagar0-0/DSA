class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first_num = Integer.MAX_VALUE;
        int second_num = Integer.MAX_VALUE;
        for(int num:nums)
        {
            if(num<=first_num)
            {
                first_num = num;
            }
            else if(num<=second_num)
            {
                second_num = num;
            }else
            {
                return true;
            }
        }
        return false;
    }
}