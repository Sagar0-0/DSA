class Solution {
  public:
    int countPaths(int n, vector<vector<int>>& roads) {
        
        long long mod = 1e9+7;
        long long ans = 0;
        vector<vector<pair<int,int>>> adj(n);
        vector<long long> dist(n,INT_MAX);
priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> pq;
        for(int i=0;i<roads.size();++i) {
            adj[roads[i][0]].push_back({roads[i][2],roads[i][1]});
            adj[roads[i][1]].push_back({roads[i][2],roads[i][0]});
        }

        dist[0]=0;
        pq.push({0,0});
        
        while(!pq.empty()) {
            auto a = pq.top();pq.pop();
            
            int wtillnow = a.first;
            int curr= a.second;
            for(auto it : adj[curr]){ 
                int wtwithadj = it.first + wtillnow;
                int u=it.second;
                
                if( u == (n-1)) {
                    if(dist[u] > wtwithadj) {
                        dist[u] = wtwithadj;
                        ans = 0;
                    }
                    if(dist[u] == wtwithadj)  ans =(ans+1)%mod;
                    continue;
                }
                if(dist[u] >= wtwithadj) {
                    dist[u] = wtwithadj;
                    pq.push({dist[u], u});
                }
            }
        }
        return ans;
    }
};

