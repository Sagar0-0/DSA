#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    int countPaths(int n, vector<vector<int>>& roads) {
        // code here
        vector<vector<pair<int, int>>> adj(n);
        for(auto road : roads){
            int u = road[0], v = road[1], t = road[2];
            adj[u].push_back({v, t});
            adj[v].push_back({u, t});
        }
        priority_queue<pair<long long, long long>, vector<pair<long long, long long>>, greater<pair<long long, long long>>> pq;
        pq.push({0, 0});
        vector<long long> dist(n, 1e18);
        dist[0] = 0;
        long long ans = 0, mod = 1000000007;
        while(!pq.empty()){
            long long node = pq.top().second, d = pq.top().first;    
            pq.pop();
            if(node == n - 1 && d == dist[n - 1]){
                ans = (ans + 1) % mod;
                continue;
            } 
            for(auto child : adj[node]){
                if(d + child.second <= dist[child.first]){
                    dist[child.first] = d + child.second;
                    pq.push({dist[child.first], child.first});
                } 
            }    
        }
        return ans;
    }
};
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n, m;
        cin >> n >> m;
        int u, v;

        vector<vector<int>> adj;

        for (int i = 0; i < m; ++i) {
            vector<int> temp;
            for (int j = 0; j < 3; ++j) {
                int x;
                cin >> x;
                temp.push_back(x);
            }
            adj.push_back(temp);
        }

        Solution obj;
        cout << obj.countPaths(n, adj) << "\n";
    }

    return 0;
}