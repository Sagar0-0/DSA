class Solution {
      public boolean find132pattern(int[] nums) {
        int len = nums.length;
        if (len < 3)return false;
        Deque<Integer> stk = new ArrayDeque<>();
        int k = -1;
        for (int i = len - 1; i >= 0; i--) {
            if (k > -1 && nums[k] > nums[i]) {
                return true;
            }

            while (!stk.isEmpty() && nums[i] > nums[stk.peek()]) {
                k = stk.pop();
            }

            stk.push(i);
        }
        return false;
    }
}