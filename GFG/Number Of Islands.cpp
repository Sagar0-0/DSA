typedef pair<int,int> ip;
int d[4]={1,-1,0,0};
class DSU{
    int **rank;
    public:
    ip **parent;
    DSU(int n,int m){
        parent = new ip*[n],rank=new int*[n];
        for(int i=0;i<n;i++)
            parent[i]=new ip[m],rank[i]=new int[m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                parent[i][j]={i,j},rank[i][j]=1;
    }
    ip find(int i,int j){
        if(parent[i][j]==make_pair(i,j))
            return {i,j};
        return parent[i][j]=find(parent[i][j].first,parent[i][j].second);
    }
    void merge(ip u,ip v){
        int i1,j1,i2,j2;
        tie(i1,j1)=u;
        tie(i2,j2)=v;
        if(rank[i1][j1]>rank[i2][j2])
            parent[i2][j2]=parent[i1][j1],rank[i1][j1]++;
        else
            parent[i1][j1]=parent[i2][j2],rank[i2][j2]++;
    }
};
class Solution {
    vector<vector<int> >mat;
    public:
    vector<int> numOfIslands(int n, int m, vector<vector<int>> &operators) {
        DSU ds(n,m);
        vector<int> ans;
        mat.resize(n,vector<int>(m,0));
        int islands=0;
        for(auto it:operators){
            int i=it[0],j=it[1];
            if(!mat[i][j]){
                mat[i][j]=1;
                islands++;
                for(int k=0;k<4;k++){
                    int x=i+d[k],y=j+d[3-k];
                    if(x>=0 && x<n && y>=0 && y<m && mat[x][y]){
                        ip u=ds.find(i,j), v=ds.find(x,y);
                        if(u!=v)
                            islands--,ds.merge(u,v);
                    }
                }
            }
            ans.push_back(islands);
        }
        return ans;
    }
};
