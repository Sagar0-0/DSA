class Solution {
public:
        bool dfs(int i, int j, int n, int m, vector<vector<char>> &a, string &s, int ind)
        {
        if(ind==s.size()) return 1;
        if(i<0 || j<0 || i>=n | j>=m || a[i][j] != s[ind]) return 0;
        char temp=a[i][j];
        a[i][j]='*';
        bool p=dfs(i+1, j, n, m, a, s, ind+1);
        bool q=dfs(i-1, j, n, m, a, s, ind+1);
        bool r=dfs(i, j+1, n, m, a, s, ind+1);
        bool t=dfs(i, j-1, n, m, a, s, ind+1);
        a[i][j]=temp;
        return p|q|r|t;
        }
    bool wordSearch(vector<vector<char>>& a, string s) 
    {
        int i, j, n=a.size(), m=a[0].size(), ind=0;
        for(i=0;i<n;i++) 
        {
            for(j=0;j<m;j++) 
            {
                if(a[i][j]==s[0]) 
                {
                    if(dfs(i,j,n,m,a,s,ind)) return 1;
                }
            }
        }
        return 0;
    }
};
