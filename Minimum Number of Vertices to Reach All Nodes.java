class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<List<Integer>> adj=new ArrayList<>();
        List<Integer> ansList=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            adj.add(l);
        }
        
        for(int i=0;i<edges.size();i++){
            adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        
        
        for(int i=0;i<n;i++){
            if(adj.get(i).size()==0){
                ansList.add(i);
            }
        }
        
        return ansList;
    }

}
