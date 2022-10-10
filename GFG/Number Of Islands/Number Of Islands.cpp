class UnionFind {
    vector<int> parent;
    int sz;
    
    public:
    
    UnionFind(int size)
    {
        sz = size;
        
        parent = vector<int>(sz);
        
        for(int i=0; i<sz; i++)
            parent[i] = i;
    }
    
    void Union(int x, int y)
    {
        int p = findParent(x);
        int q = findParent(y);
        
        parent[q] = p;
    }
    
    int findParent(int x)
    {
        if(parent[x] == x)
            return x;
            
        return parent[x] = findParent(parent[x]);
    }
    
    int count(vector<vector<bool>> &mat)
    {
        int cnt = 0, p = 0;
        
        for(auto it : mat)
        {
            for(auto it1 : it)
            {
                if(it1 and parent[p] == p)
                cnt++;
                
                p++;
            }
        }
        
        return cnt;
    }
};

class Solution {
  public:
    vector<int> numOfIslands(int n, int m, vector<vector<int>> &operators) {
        // code here
        vector<vector<bool>> mat(n, vector<bool>(m,false));
        vector<int> ans;
        int dir[5] = {1, 0, -1, 0, 1};
        
        UnionFind uf(n*m);
        
        for(auto it : operators)
        {
            int x = it[0];
            int y = it[1];
            
            mat[x][y] = true;
            
            for(int i=0; i<4; i++)
            {
                int nx = x+dir[i];
                int ny = y+dir[i+1];
                
                if(nx >= 0 and ny >= 0 and nx < n and ny < m and mat[nx][ny])
                    uf.Union(x*m+y, nx*m+ny);
            }
            
            ans.push_back(uf.count(mat));
        }
        
        return ans;
    }
};
