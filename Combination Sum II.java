public class Solution {
	ArrayList<ArrayList<Integer>> ans;
	int n;
	Set<ArrayList<Integer>> set;
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
		Collections.sort(a);
		n=b;
		set=new HashSet<>();
		ans=new ArrayList<>();
		dfs(0,a,new ArrayList<>(),0);
		return ans;
	}
	void dfs(int idx,ArrayList<Integer> a,ArrayList<Integer> curr,int sum){
		if(sum==n){
			if(!set.contains(curr)){
				set.add(curr);
				ans.add(new ArrayList<>(curr));
				return;
			}
		}
		if(idx==a.size())return;
		for(int i=idx;i<a.size();i++){
			curr.add(a.get(i));
			sum+=a.get(i);
			if(sum<=n){
				dfs(i+1,a,curr,sum);
				curr.remove(curr.size()-1);
				sum-=a.get(i);
			}else{
				curr.remove(curr.size()-1);
				sum-=a.get(i);
				return;
			}
			
		}
	}
}
