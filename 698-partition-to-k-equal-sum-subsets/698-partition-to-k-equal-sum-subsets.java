class Solution {
    public boolean canPartitionKSubsets(int[] arr, int k) {
        int n = arr.length;
        int sum=0;
        for(int i:arr) sum+=i;
        if(sum%k!=0) return false;
        Arrays.sort(arr);
        
        return (dfs(n-1,arr,new int[k],k,sum/k));
    }
    public boolean dfs(int ind,int[] arr,int[] sum, int k,int target){
        if(ind == -1)return true;
        for(int i=0;i<k;i++){
            if((sum[i] + arr[ind]>target) || (i>0 && sum[i] == sum[i-1]))continue;
            
            sum[i]+=arr[ind];
            
            if(dfs(ind-1,arr,sum,k,target))return true;
            sum[i]-= arr[ind];
        }
        return false;
    }
}