public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        Collections.sort(A);
        dfs(0,A,new ArrayList<>());
        return ans;
    }
    public void dfs(int idx,ArrayList<Integer> a,ArrayList<Integer> curr){
        if(idx==a.size())return;
        for(int i=idx;i<a.size();i++){
            curr.add(a.get(i));
            if(!ans.contains(curr))ans.add(new ArrayList<>(curr));
            dfs(i+1,a,curr);
            curr.remove(curr.size()-1);
        }
    }
}
