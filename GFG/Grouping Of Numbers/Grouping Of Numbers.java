class Solution {
    static int maxGroupSize(int[] a, int N, int k) {
        // code here
        int[]dp=new int[k];
        for(int i:a){
            dp[i%k]++;
        }
        
        int maxSize=0;
        int i=1;
        int j=k-1;
        while(i<j){
            maxSize+=Math.max(dp[i],dp[j]);
            i++;
            j--;
        }
        if(dp[0]>0){
            maxSize++;
        }
        if(i==j && dp[i]>0){
            maxSize++;
        }
        return maxSize;
    }
};
