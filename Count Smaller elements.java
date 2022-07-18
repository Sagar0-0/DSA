class Solution {
    int[] constructLowerArray(int[] a, int n) {
        int[]ans=new int[n];
        int ii=n-2;
        List<Integer> arr=new ArrayList<>();
        arr.add(a[n-1]);
        for(int i=n-2;i>=0;i--){
            int idx=dfs(arr,a[i],0,arr.size()-1);
            ans[ii]=idx;
            ii--;
            arr.add(idx,a[i]);
        }
        // for(int i:arr)System.out.print(i+" ");
        return ans;
    }
    int dfs(List<Integer> arr,int key,int l,int h){
        if(l<=h){
            int mid=l+(h-l)/2;
            if(arr.get(mid)>=key){
                return dfs(arr,key,l,mid-1);
            }
            return dfs(arr,key,mid+1,h);
        }
        return l;
    }
}
