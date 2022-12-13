class Solution {
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int l=0;
        int h=0;
        int ans=0;
        for(int i:arr){
            l=Math.max(l,i);
            h+=i;
        }
        
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(mid,arr,K)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int maxSum,int[]arr,int k){
        int cnt=0;
        int currSum=0;
        for(int i:arr){
            if(currSum+i>maxSum){
                cnt++;
                currSum=i;
            }else{
                currSum+=i;
            }
        }
        
        if(currSum<=maxSum)cnt++;
        return cnt<=k;
    }
};
