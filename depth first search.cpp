#include <iostream>
#include <vector>
using namespace std;

void dfs(vector<int>* adj,int node,vector<int>& visited)
{
    visited[node]=1;
    cout<<node<<" ";
    for(auto it:adj[node])
    {
        if(!visited[it])
        dfs(adj,node,visited);
    }
    
    return ;
}

int main()
{
    //taking input
    int n,e;
    cin>>n>>e; // n is number of vertix
               // e is number of edges
    
    vector<int> adj[n];
    while(e--)
    {
        int u,v;
        cin>>u>>v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    
    vector<int> visited(n,0);
    for(int i=0;i<n;i++)
    {
        if(!visited[i])
        dfs(adj,i,visited);
    }
    
    return 0;
}