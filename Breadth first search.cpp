#include <iostream>
#include <vector>
#include <queue>
using namespace std;

void bfs(int node,vector<int>* adj,vector<int>* visited) 
{
        queue<int> q;
        q.push(node);
        visited[node]=1;
        
        while(!q.empty())
        {
            int node=q.front();
            q.pop();
            cout<<node<<" ";
            
            for(auto it:adj[node])
            {
                if(!visited[it])
                {
                    visited[it]=1;
                    q.push(it);
                }
            }
        }
        
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
        bfs(i,adj,visited);
    }
    
    return 0;
}
