#include<bits/stdc++.h>
using namespace std;
void funct(vector<int> adj[],vector<int> &vis,stack<int>&st,int node){
    vis[node]=1;
    for(auto it:adj[node]){
        if(!vis[it]){
            funct(adj,vis,st,it);
        }
    }
    st.push(node);
}

void topo(int n, vector<int> adj[]){
    stack<int> st;
    vector<int> vis(n,0);
    for(int i =0;i<n;i++){
        if(!vis[i]){
            funct(adj,vis,st,i);
        }
    }
    vector<int> v;
    while(!st.empty()){
        v.push_back(st.top());
        st.pop();
    }
    for(int i =0;i< v.size();i++){
        cout<<v[i]<<" ";
    }
    cout<<endl;
}

int main(){
    int m,n;
    cin>>m>>n;
    vector<int> adj[m];
    for(int i =0;i<n;i++){
        int x,y;
        cin>>x>>y;
        adj[x].push_back(y);
    }
    topo(m,adj);
    return 0;
}
