class Solution {
    public int findMinArrowShots(int[][] points) {
        
        // This Problem is similar to Non Overlapping Interval Problem of Greedy Approach
        // Link for detiled discussion : http://www.leetcode-solution.com/2019/06/01/0452-minimum-number-of-arrows-to-burst-balloons.html
        
        // Base case
        if(points.length == 0)
            return 0;
        
        // Sort the point accroding to their end points i.e., a[1] - b[1]
        Arrays.sort(points, (a,b) -> a[1] - b[1]);
        
        // Position arrow at end (Extreme Right) as it has maximum chance of hittng there
        int arrPos = points[0][1];
        int count = 1; // Minimun 1 arrow is required to shoot any points
        
        for(int i = 1; i < points.length; i++ ) // start with 1 as 0th index end will be check for start of 1st 
        {
            int left  = points[i][0];
            int right = points[i][1];
            
            
            //check whether the arrowFired can burst other balloons.
            //if not fire arrow at the next point end value
            if (!(arrPos >= left && arrPos <= right)) 
            {
                
                count++; // increase the arrowsFired by 1.
                arrPos = points[i][1];  // next point end value.
                
            }
          /*  if(arrPos >= points[i][0]) // Since Current arrow position than start pos of array that means we can 
            {                          // continue, but as soon as it not true we break as our current arrow pos
                continue;              // cant handle beyond that point . so update its pos and count++
            }
            count++ ;                 // As we are done with current pos 
            arrPos = points[i][1];    // Update as we already exhausted our option with previous position
        */
        
        }
        
        return count;
    }
}
