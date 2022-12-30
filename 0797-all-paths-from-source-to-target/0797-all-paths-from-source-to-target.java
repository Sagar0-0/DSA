class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        dfs(graph,ans,temp,0);
        return ans;
    }
    
   public void dfs(int[][] graph, List<List<Integer>> ans, List<Integer> temp, int start){
       
        if(start == graph.length-1){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i : graph[start]){
            temp.add(i);
            dfs(graph,ans,temp,i);
            temp.remove(temp.size()-1);  
        }
        
    }
}