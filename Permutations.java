public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        int n=A.size();
        ans=new ArrayList<>();
        boolean[] vis=new boolean[n];
        dfs(new ArrayList<>(),A,vis);
        return ans;
    }
    public void dfs(ArrayList<Integer> curr,ArrayList<Integer> A,boolean[]vis){
        if(curr.size()==A.size()){
            if(!ans.contains(curr)){
                ans.add(new ArrayList(curr));
            }
            return;
        }
        for(int i=0;i<A.size();i++){
            if(!vis[i]){
                curr.add(A.get(i));
                vis[i]=true;
                dfs(curr,A,vis);
                curr.remove(curr.size()-1);
                vis[i]=false;
            }
        }
    }
}
