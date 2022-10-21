class Solution
{
    public:
    bool dfs(int n, vector<int> &visited, vector<int> adj[],int node){
        if(n == 0) return true;
        visited[node] = 1;
        for(auto nbr: adj[node]){
            if(visited[nbr] == 0){
             if(dfs(n-1, visited, adj, nbr)){
                return true;
              }
            }
        }
        visited[node] = 0;
        return false;
    }
    public:
    bool check(int N,int M,vector<vector<int>> Edges)
    {
       vector<int> adj[N];
       for(auto i: Edges){
           adj[ i[0] - 1].push_back(i[1] - 1);
           adj[ i[1] - 1].push_back(i[0] - 1);
       }
       vector<int> visited(N, 0);
       
       for(int i = 0;i<N;i++){
           if(dfs(N-1, visited, adj, i)){
               return true;
           }
       }
       return false;
    }
};
