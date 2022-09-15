long long int mod= 1e9+7;
    int countPaths(int n, vector<vector<int>>& roads) {
       
        vector<vector<pair<int, int>>> arr(n);
        for(auto it :roads){
            arr[it[0]].push_back({it[1], it[2]});
            arr[it[1]].push_back({it[0], it[2]});
        }
    priority_queue<pair<int, int>,vector<pair<int, int>>,greater<pair<int, int>>>pq;
    vector<int > dist(n, INT_MAX);
    dist[0]=0;
    pq.push({0,0});
    int ans=0;
      while(!pq.empty()){
        int dis= pq.top().first;
        int prev= pq.top().second;
        pq.pop();
        for(auto it : arr[prev]){
            int next= it.first;
            int nextdist= it.second;
            if(next== n-1){
                if(dist[n-1]== dis+nextdist){
                    ans= (ans+1ll)%mod;
                   }
                else if(dist[n-1]>dis+nextdist){
                    ans=1;
                    dist[n-1]= dis+nextdist;
                    }
                }
              else if(dis+nextdist<=dist[next]){
                  dist[next]= dist[prev]+nextdist;
                    pq.push({dist[next], next});
                }
            }
        }
       return ans;
    }