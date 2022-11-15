#include <bits/stdc++.h>
using namespace std;


void toposort(vector<pair<int, int>> adj[], vector<int> &vis, stack<int> &st, int node)
{
  vis[node] = 1;
  for (auto it : adj[node])
  {
    if (!vis[it.first])
    {
      toposort(adj, vis, st, it.first);
    }
  }
  st.push(node);
}

void sdd(vector<pair<int, int>> adj[], int n, int src)
{
  vector<int> vis(n, 0);
  stack<int> st;

  for (int i = 0; i < n; i++)
  {
    if (!vis[i])
    {
      toposort(adj, vis, st, i);
    }
  }
  vector<int> dist(n, INT_MAX);
  dist[src] = 0;
  while (!st.empty())
  {
    int node = st.top();
    st.pop();

    if(dist[node]!=INT_MAX){
        for(auto it: adj[node]){
            if(dist[node]+it.second<dist[it.first] ){
                dist[it.first]=dist[node]+it.second;
            }
        }
    }
  }


  for(int i =0;i< n;i++){
    dist[i]==INT_MAX?cout<<"INF"<<" " : cout<<dist[i]<<" ";
  }
  cout<<endl;
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
  sdd(adj, m, src);
  return 0;
}
