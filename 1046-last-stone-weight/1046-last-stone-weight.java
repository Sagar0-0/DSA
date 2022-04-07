class Solution {
    public int lastStoneWeight(int[] stones) {
        int c = stones.length;
        while(c > 1){
            Arrays.sort(stones);
            stones[c-2]=stones[c-1] - stones[c-2];
            c--;
        }
        
        return stones[0];
        
    }
}