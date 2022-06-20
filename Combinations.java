public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    int n;
    int k;
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ans=new ArrayList<>();
        this.n=n;
        this.k=k;
        dfs(1,new ArrayList<>());
        return ans;
    }
    public void dfs(int curr,ArrayList<Integer> curList){
        if(curList.size()==k){
            ans.add(new ArrayList<>(curList));
            return;
        }
        for(int i=curr;i<=n;i++){
            curList.add(i);
            dfs(i+1,curList);
            curList.remove(curList.size()-1);
        }
    }
}
