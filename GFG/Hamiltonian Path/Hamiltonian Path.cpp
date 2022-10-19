
class Solution
{
    public:
void dfs(int src, vector<bool> &visited, vector<vector<int>> &adj, int &cnt, int N){
    cnt++;
    if(adj[src].size()==0){
        if(cnt<N) cnt--;
        return;}
    
    visited[src] = true;
    
    for(int i=0;i<adj[src].size();i++){
        if(visited[adj[src][i]]==false){
            dfs(adj[src][i], visited, adj, cnt, N);
        }
        if(cnt==N){
            visited[src] = false;
            return;
        }
    }
    
    if(cnt<N) cnt--;
    visited[src] = false;
}    
    bool check(int N,int M,vector<vector<int>> Edges)
    {
        vector<vector<int>> adj(N+1);
        for(int i=0;i<Edges.size();i++){
            int u = Edges[i][0], v = Edges[i][1];
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        
        
        vector<bool> vis(N+1, false);
        for(int i=1;i<=N;i++){
            int cnt = 0;
            dfs(i, vis,adj, cnt, N);
            if(cnt==N) return true;
        }
        
        return false;
    }
};
