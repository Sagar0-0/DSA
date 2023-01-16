class Solution {
    // Returns true if the intervals a and b have a common element.
    boolean doesIntervalsOverlap(int[] a, int[] b) {
        return Math.min(a[1], b[1]) - Math.max(a[0], b[0]) >= 0;
    }

    // Return the interval having all the elements of intervals a and b.
    int[] mergeIntervals(int[] a, int[] b) {
        int[] newInterval = {Math.min(a[0], b[0]), Math.max(a[1], b[1])};
        return newInterval;
    }

    int UpperBound(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            // If the list is empty, just insert the newInterval at the 0th position.
            return 0;
        }

        int start = 0, end = intervals.length - 1;
        int ans = intervals.length;
        while (start <= end) {
            int mid = (start + end) / 2;

            // If the start value is greater than the newInterval
            // This could be the position, so store it but keep looking on the left side.
            if (intervals[mid][0] > newInterval[0]) {
                ans = mid;
                end = mid - 1;
            } else {
                // Search on the right side of mid.
                start = mid + 1;
            }
        }

        return ans;
    }

    // Insert the interval newInterval, into the list interval keeping the sorting order intact.
    int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        int index = UpperBound(intervals, newInterval);

        if (index != intervals.length) {
            list.add(index, newInterval);
        } else {
            list.add(newInterval);
        }

        return list.toArray(new int[list.size()][2]);
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Insert the interval first before merge processing.
        intervals = insertInterval(intervals, newInterval);

        List<int[]> answer = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] currInterval = {intervals[i][0], intervals[i][1]};
            // Merge until the list gets exhausted or no overlap is found.
            while (i < intervals.length && doesIntervalsOverlap(currInterval, intervals[i])) {
                currInterval = mergeIntervals(currInterval, intervals[i]);
                i++;
            }
            // Decrement to ensure we don't skip the interval due to outer for-loop incrementing.
            i--;
            answer.add(currInterval);
        }

        return answer.toArray(new int[answer.size()][2]);
    }
}