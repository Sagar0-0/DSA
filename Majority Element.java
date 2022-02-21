//Boyer-Moore Voting Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}

//=================================================================

//recursive
class Solution {

public int majorityElement(int[] nums) {
        return recurse(nums, 0);
    }
    
    public int recurse(int[] nums, int start){
        int n = nums.length;
        int tracker= 1;
        for(int i=start+1;i<n;i++){
            if(nums[start]==nums[i]){
                tracker++;
            }else{
                tracker--;
            }
            if(tracker==0){
                return recurse(nums, i+1);
            }
        }
        return nums[start];
    }
}

//=====================================================================
//Naive approach using map
    class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new  HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }
        }
        return Collections.max(map.entrySet(),Comparator.comparingInt(Map.Entry::getValue))
            .getKey();
    }
}
