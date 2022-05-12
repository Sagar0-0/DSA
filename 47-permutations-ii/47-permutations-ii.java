class Solution {
    List<List<Integer>> ans;
    Set<List<Integer>> set;
    public List<List<Integer>> permuteUnique(int[] nums) {
        set=new HashSet<>();
        ans=new ArrayList<>();
        int n=nums.length;
        boolean[] vis=new boolean[n];
        dfs(nums,vis,n,new ArrayList<>());
        return ans;
    }
    public void dfs(int[]nums,boolean[]vis,int n,List<Integer> curr){
        if(n==0){
            if(!set.contains(curr)){
                set.add(curr);
                List<Integer> newCurr=new ArrayList<>();
                newCurr.addAll(curr);
                ans.add(newCurr);
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                curr.add(nums[i]);
                vis[i]=true;
                dfs(nums,vis,n-1,curr);
                curr.remove(curr.size()-1);
                vis[i]=false;
            }
        }
    }
}