class Solution {
   
  public:
    int minimumCost(vector<vector<int>>& flights, int n, int k) {
        // code here
        
        unordered_map<int,list<pair<int,int>> > adj;
        for(int i = 0; i < flights.size(); i++)
        {
            int u = flights[i][0];
            int v = flights[i][1];
            int w = flights[i][2];
            
            adj[u].push_back({v,w});
            
        }
        
        vector<int> dist(n+1, INT_MAX);
        
        set<pair<int,int>> s; //distNode, node
        
        dist[k] = 0;
        s.insert({0, k});
        
        while(!s.empty())
        {
            auto top = *(s.begin());
            s.erase(s.begin());
            
            int distNode = top.first;
            int node = top.second;
            
            for(auto neigh : adj[node])
            {
                if(distNode + neigh.second < dist[neigh.first])
                {
                    dist[neigh.first] = distNode + neigh.second;
                    
                    s.insert({dist[neigh.first], neigh.first});
                }
            }
        }
        
        int ans = 0;
        
        for(int i = 1; i <= n; i++)
        {
            if(dist[i] == INT_MAX) return -1;
            
            ans = max(ans, dist[i]);
              
            // cout<<dist[i]<<" ";
        }
        return ans;
    }
};
