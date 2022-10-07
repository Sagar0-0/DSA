class Solution {
public:
    
    void dfs(vector<int> adj[],vector<int>&vis,int node,int &no){
        vis[node]=1;
        no++;
        for(auto it:adj[node]){
            if(vis[it]==0){
                dfs(adj,vis,it,no);
            }
        }
    }
    
    int reachableNodes(int n, vector<vector<int>>& edges, vector<int>& res) {
        vector<int> adj[n];
        vector<int> v(n,0);
        for(int i =0;i<edges.size();i++){
            adj[edges[i][0]].push_back(edges[i][1]);
            adj[edges[i][1]].push_back(edges[i][0]);
        }
        
        for(auto a:res){
            v[a]=1;
        }
        int no=0;
        dfs(adj,v,0,no);
        return no;
    }
};
