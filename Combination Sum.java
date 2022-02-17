class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, candidates, target, new ArrayList<>(), 0, 0);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, int[] candidates, int target, List<Integer> potential, int currSum, int startIndex) {
        if (currSum == target) {
            res.add(new ArrayList<>(potential));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            int num = candidates[i];
            if (currSum + num <= target) {
                potential.add(num);
                backtrack(res, candidates, target, potential, currSum + num, i);
                potential.remove(potential.size() - 1);
            }
        }
    }
}
