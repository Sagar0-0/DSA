class Solution {
    class Job implements Comparable<Job>{
        int start;
        int end;
        int profit;
        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
        public int compareTo(Job otherJob) {
            return this.start - otherJob.start;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        Job[] jobs = new Job[n];
        for (int i=0; i<n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(jobs);
        int[] dp = new int[n];
        dp[n-1] = jobs[n-1].profit;
        for (int i=n-2; i >=0; i--) {
            dp[i] = Math.max(jobs[i].profit, dp[i+1]);
            for (int j=i+1; j < n; j++) {
                if (jobs[i].end <= jobs[j].start) {
                    dp[i] = Math.max(dp[i], jobs[i].profit + dp[j]);
                    break;
                }
            }
        }
        return dp[0];
    }
}