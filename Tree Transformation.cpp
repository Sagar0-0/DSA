class Solution {
    public:
    int solve(int N, vector<int> p){
        // code here
        
        int g[N + 1] = {0};
        
        for (int i = 1; i < p.size(); i++) {
            g[p[i]]++;
            g[i]++;
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (g[i] == 1)
                cnt++;
        }
        
        cnt = N - cnt;
        
        return max(cnt - 1, 0);
    }
};
