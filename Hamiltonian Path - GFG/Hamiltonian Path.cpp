class Solution
{
    public:
    bool dfs(int n, vector<int> adj[], vector<int> &vist, int src){
        if(n==0){
            return true;
        }
        vist[src]=1;
        for(auto &x:adj[src]){
            if(vist[x]==0){
                if(dfs(n-1,adj,vist,x)){
                    return true;
                }
            }
        }
        vist[src]=0;
        return false;
    }
    
    
    bool check(int n,int m,vector<vector<int>> e)
    {
        // code here
        vector<int> adj[n];
        
        for(auto &x:e){
            adj[x[0]-1].push_back(x[1]-1);
            adj[x[1]-1].push_back(x[0]-1);
        }
        
        vector<int> vist(n,0);
        
        for(int i=0;i<n;i++){
            if(dfs(n-1,adj,vist,i)){
                return true;
            }
        }
        return false;
    }
};
