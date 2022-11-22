class Solution
{
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        // Code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        int idx=n-1;
        
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        dfs(ans,curr,idx,n,arr);
        return ans;
    }
    void dfs(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> curr,
    int idx,int n,int[]arr){
        if(idx<0 || n<0)return;
        curr.add(arr[idx]);
        if(n-arr[idx]==0){
            ans.add(new ArrayList<>(curr));
        }
        dfs(ans,curr,idx,n-arr[idx],arr);
        curr.remove(curr.size()-1);
        dfs(ans,curr,idx-1,n,arr);
        
    }
}
