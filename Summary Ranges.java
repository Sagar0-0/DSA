class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        StringBuilder buf = new StringBuilder();
        for(int i = 0; i < nums.length; i++)
        {
            buf.setLength(0);
            int index = i;
            while(index < nums.length-1 && nums[index]+1 == nums[index+1]){
                index++;
            }
            if(index == i){
                buf.append("");
                buf.append(nums[i]);
            }else{
                buf.append(nums[i]);
                buf.append("->");
                buf.append(nums[index]);
            }
            res.add(buf.toString());
            i = index;
        }
        return res;
    }
}
