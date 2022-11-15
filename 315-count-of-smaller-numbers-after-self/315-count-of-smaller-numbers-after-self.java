class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        Integer[] ans=new Integer[n];
        ans[n-1]=0;
        int ii=n-2;
        List<Integer> arr=new ArrayList<>();
        arr.add(nums[n-1]);
        for(int i=n-2;i>=0;i--){
            int idx=dfs(arr,nums[i]);
            arr.add(idx,nums[i]);
            ans[ii]=idx;
            ii--;
        }
        return Arrays.asList(ans);
    }
    int dfs(List<Integer> arr,int ele){
        int l=0;
        int h=arr.size()-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(ele<=arr.get(mid)){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}