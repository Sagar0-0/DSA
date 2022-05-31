public class Solution {
    ArrayList<ArrayList<Integer>> lists;
    boolean[] added;

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        lists = new ArrayList<>();
        Collections.sort(nums);
        added = new boolean[nums.size()];
        permuteUnique(nums, new ArrayList<>());
        return lists;
    }

    private void permuteUnique(ArrayList<Integer> nums, List<Integer> list) {
        if(list.size() == nums.size()) {
            lists.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.size(); i++) {
            if(added[i])
                continue;
            if(i > 0 && nums.get(i) == nums.get(i-1) && !added[i - 1])
                continue;
            list.add(nums.get(i));
            added[i] = true;
            permuteUnique(nums, list);
            list.remove(list.size() - 1);
            added[i] = false;
        }
    }
}
