class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0, n = gas.length;
        int gasInTank = 0, start = 0;
        for(int i=0;i<n;i++) {
            gasInTank += gas[i]-cost[i];
            sum += gas[i]-cost[i];
            // if we are not able to reach next station from i, 
            if(gasInTank < 0) {
                start = i+1;
                gasInTank = 0;
            }
        }
        
        return sum >= 0 ? start : -1;
    }
}