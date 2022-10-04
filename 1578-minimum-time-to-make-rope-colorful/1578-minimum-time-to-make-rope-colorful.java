class Solution {
    public int minCost(String colors, int[] neededTime) {
        int prev = 0;
        int res = 0;
        char arr[] = colors.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[prev] != arr[i])
               prev = i;
            
            else {
                if (neededTime[prev] < neededTime[i]) {
                    res += neededTime[prev];
                    prev = i;
                }
                
                else {
                    res += neededTime[i];
                }
            }
        }
        return res;
    }
}