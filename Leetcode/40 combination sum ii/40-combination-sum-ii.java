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