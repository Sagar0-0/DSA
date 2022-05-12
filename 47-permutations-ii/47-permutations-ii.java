class Solution {
    
    List<List<Integer>> lists;
    boolean[] added;
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        lists = new ArrayList<>();
        Arrays.sort(nums);
        added = new boolean[nums.length];
        permuteUnique(nums, new ArrayList<>());
        return lists;
    }
    
    private void permuteUnique(int[] nums, List<Integer> list) {
        if(list.size() == nums.length) {
            lists.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(added[i])
                continue;
            // avoid permute duplicates
            if(i > 0 && nums[i] == nums[i - 1] && !added[i - 1])
                continue;
            list.add(nums[i]);
            added[i] = true;
            permuteUnique(nums, list);
            list.remove(list.size() - 1);
            added[i] = false;
        }
    }
}