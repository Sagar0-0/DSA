class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length;
        List<List<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<=n+1;i++){
            ArrayList<Integer> list=new ArrayList<>();
            adj.add(list);
        }
        
        for(int i=0;i<n;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        int ans=0;
        for(int i=0;i<adj.size();i++){
            if(adj.get(i).size()==n){
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}
