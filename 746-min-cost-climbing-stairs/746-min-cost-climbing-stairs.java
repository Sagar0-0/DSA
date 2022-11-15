class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] mem = new int[cost.length];
        mem[0]=cost[0];
        mem[1]=cost[1];
        for(int i=2;i<cost.length;i++) {
            mem[i]=cost[i]+Math.min(mem[i-1],mem[i-2]);
        }
        return Math.min(mem[cost.length-1],mem[cost.length-2]);
    }
}