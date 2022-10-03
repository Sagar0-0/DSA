# Approach 1 by @Sagar0-0

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

# Approach-2 by @Jay-Thesia

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> outter=new ArrayList<>();
        Arrays.sort(candidates);
        Combinations(0,candidates,target,outter,new ArrayList<Integer>());
        return outter;
    }
    
    public void Combinations(int idx,int[] candidates,int target,List<List<Integer>> outter,List<Integer> inner){
        
        
        if(target==0 ){
            outter.add(new ArrayList<>(inner));
            return;
        }
               
        else if(target<0){
            return;
        }
        
        for(int i=idx;i<candidates.length;i++){
            
            if(i==idx || candidates[i]!=candidates[i-1]){
          
            
            inner.add(candidates[i]);
            Combinations(i+1,candidates,target-candidates[i],outter,inner);
            inner.remove(inner.size()-1);
        } 
        }
    }
}
