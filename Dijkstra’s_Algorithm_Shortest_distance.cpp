#include<bits/stdc++.h>
using namespace std;
void dij(vector<pair<int, int>> adj[], int n, int src)
{
  vector<int> vis(n, 0);
  priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
  vector<int> dis(n, INT_MAX);

  pq.push({0, src});
  dis[src] = 0;
  while (!pq.empty())
  {
    int dist = pq.top().first;
    int prev = pq.top().second;
    pq.pop();
    vector<pair<int, int>>::iterator it;
    for (it = adj[prev].begin(); it != adj[prev].end(); it++)
    {
      int next = it->first;
      int nextdist=it->second;
      if (dis[next] > dis[prev] + nextdist)
      {
        dis[next] = dis[prev] + nextdist;
        pq.push({dis[next],next});
      }
    }
  }
  for (int i = 0; i < dis.size(); i++)
  {
    dis[i]==INT_MAX?cout<<"INF"<<" ":cout<<dis[i]<<" ";
  }
  
}

int main()
{
  int m, n;
  cin >> m >> n;
  vector<pair<int, int>> adj[m];
  for (int i = 0; i < n; i++)
  {
    int x, y, w;
    cin >> x >> y >> w;
    adj[x].push_back({y, w});
  }
  int src;
  cin >> src;
  dij(adj, m, src);
}
