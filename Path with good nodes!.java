public class Solution {
    public int solve(int[] type, int[][] B, int C) {
        int n = type.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for(int[] edge : B){
            adj.get(edge[0] - 1).add(edge[1] - 1);
            adj.get(edge[1] - 1).add(edge[0] - 1);
        }
        return dfs(0, type, C - type[0], -1, adj);
    }
    private int dfs(int root,int[] type, int goodNodes, int par, ArrayList<ArrayList<Integer>> adj){
        if(goodNodes < 0) return 0;
        int cnt = 0;
        // we are at leaf node
        if(adj.get(root).size() == 1) {
            return 1;
        }

        for(int  child :adj.get(root)){
            if(child == par)continue;
            cnt += dfs(child, type, goodNodes - type[child], root, adj);
        }
        return cnt;
    }
}
