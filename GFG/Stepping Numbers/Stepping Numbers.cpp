class Solution{
public:
unordered_map<int, int> mp;

public:
    void dfs(int n, int m)
    {
        if (n > m)
            return;

        if (mp.find(n) != mp.end())
            return;

        mp[n] = 1;

        if (n % 10 == 0)
            dfs(n * 10 + 1, m);
        else if (n % 10 == 9)
            dfs(n * 10 + 8, m);
        else
        {
            dfs(n * 10 + (n % 10) - 1, m);
            dfs(n * 10 + (n % 10) + 1, m);
        }
    }
    int steppingNumbers(int n, int m)
    {
        // Code Here
        mp.clear();

        for (int i = 0; i <= 9; i++)
            dfs(i, m);

        int ans = 0;

        for (auto i : mp)
            ans += (i.first >= n and i.second <= m);

        return ans;
    }

};
