class Solution {
    List<List<Integer>> ans;
    Set<Set<Integer>> megaSet;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans=new ArrayList<>();
        megaSet=new HashSet<>();
        dfs(new ArrayList<Integer>(),new HashSet<Integer>(),n,k);
        return ans;
    }
    public void dfs(List<Integer> curr,Set<Integer> set,int n,int k){
        if(k==0){
            if(n==0){
                if(!megaSet.contains(set)){
                    Set<Integer> newSet=new HashSet<>();
                    newSet.addAll(set);
                    List<Integer> newCurr=new ArrayList<>();
                    newCurr.addAll(curr);
                    megaSet.add(newSet);
                    ans.add(newCurr);
                }
            }
            return;
        }
        for(int i=1;i<=9;i++){
            if(!set.contains(i) && n>=i){
                curr.add(i);
                set.add(i);
                dfs(curr,set,n-i,k-1);
                curr.remove(curr.size()-1);
                set.remove(i);
            }
        }
    }
}