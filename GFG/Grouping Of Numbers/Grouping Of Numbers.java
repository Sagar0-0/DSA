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


// Method 2:

class Solution {
    static int maxGroupSize(int[] arr, int N, int K) {
        // code here
        int freq[]=new int[K];
        for(int i=0;i<N;i++) {
            freq[arr[i]%K]+=1;
        }
        int start=1;
        int end=K-1;
        while(start<=end) {
            if(start!=end) {
                if(freq[start]!=0 && freq[end]!=0) {
                    if(freq[start]>freq[end]) {
                        freq[end]=0;
                    }
                    else {
                        freq[start]=0;
                    }
                }
            }
            else {
                if(freq[start]>0) freq[start]=1;
            }
            start+=1;
            end-=1;
        }
        
        if(freq[0]>0) freq[0]=1;
        
        int count=0;
        for(int i=0;i<K;i++) {
            if(freq[i]>0) count+=freq[i];
        }
        return count;
    }
};
