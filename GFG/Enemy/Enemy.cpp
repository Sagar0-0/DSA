class Solution
{
    public:
        int largestArea(int n,int m,int k,vector<vector<int>> &enemy)
        {
            if(k==0) return n*m;
            vector<bool> r(n+1,false), c(m+1, false);
            
            
            for(int i=0;i<enemy.size();i++){
                int dr = enemy[i][0], dc = enemy[i][1];
                r[dr] = true, c[dc] = true;
            }
            int ans = 0, tmp = 0, dx = 0, dy = 0, mx = 0, my = 0;
            
            for(int i=1;i<=n;i++){
                if(r[i]==false) dx++;
                else dx = 0;
                mx = max(mx, dx);
            }
            
            for(int i=1;i<=m;i++){
                if(c[i]==false) dy++;
                else dy = 0;
                my = max(my, dy);
            }
            
            return mx*my;
        }
};
