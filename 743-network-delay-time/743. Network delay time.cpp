class Solution {
public:
    void dfs(vector<vector<pair<int,int>>> &adj,int vis[],int vb[],int i,int sum){
        if(sum>=vb[i]) return;
        vis[i] = 1;
        vb[i] = min(sum,vb[i]);
        for(auto &it:adj[i]){
            if(!vis[it.first]){
                dfs(adj,vis,vb,it.first,sum+it.second);
            }
        }
        vis[i] = 0;
    }
    int networkDelayTime(vector<vector<int>>& times, int n, int k) {
        int v[n];
        for(int i = 0;i<n;i++){
            v[i]=  INT_MAX;
        }
        vector<vector<pair<int,int>>> adj(n);
        for(int i = 0;i<times.size();i++){
            adj[times[i][0]-1].push_back(make_pair(times[i][1]-1,times[i][2]));
        }
        int vis[n];
        for(int i = 0;i<n;i++){
            vis[i]=  0;
        }
        int sum = 0;
        
        dfs(adj,vis,v,k-1,sum);
        int ans;
        if(k-1 != 0){
            ans = v[0];
        }
        else{
            ans = v[1];
        }
        for(int i = 0;i<n;i++){
            if(i == k-1) continue;
            else if(v[i] == INT_MAX) return -1;
            else ans = max(ans,v[i]);
        }
        return ans;
    }
};
