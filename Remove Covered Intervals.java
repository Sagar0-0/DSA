class Solution {
    public int removeCoveredIntervals(int[][] nums) {
        Arrays.sort(nums, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2){
                if(o1[0]==o2[0])return o2[1]-o1[1];
                return o1[0]-o2[0];
        }});
        int count = 0, cur = 0;
        for(int interval[] : nums){
            if(cur < interval[1]){
                cur = interval[1];
                count++;
            }
        }
        return count;
    }
}
