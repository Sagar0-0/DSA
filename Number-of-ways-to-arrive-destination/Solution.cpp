typedef pair<int,int> ip;
long long int M=1e9+7;
class Solution {
  public:
    int countPaths(int n, vector<vector<int>>& roads) {
        int ans=0;
        vector<int> dis(n,INT_MAX);
        vector<ip> adj[n];
        for(auto it: roads)
            adj[it[0]].push_back({it[1],it[2]}),adj[it[1]].push_back({it[0],it[2]});
            
        priority_queue<ip,vector<ip>,greater<ip> > pq;
        dis[0]=0;
        pq.push({dis[0],0});
        while(!pq.empty()){
            int src=pq.top().second,wt=pq.top().first;
            pq.pop();
            for(auto it: adj[src]){
                int v=it.first,nw=wt+it.second;
                if(v==n-1){
                    if(dis[v]==nw)
                        ans=(ans+1ll)%M;
                    else if(dis[v]>nw)
                        dis[v]=nw,ans=1;
                }
                else{
                    if(dis[v]>=nw)
                        dis[v]=nw,pq.push({dis[v],v});
                }
            }
        }
        return ans;
    }
};