class Solution
{
public:
    int totalWays(int n, vector<int> capacity)
    {
        sort(capacity.begin(), capacity.end());
        long ans = 1;
        for (int i = 0; i < n; i++)
            ans = ans * (capacity[i] - i) % ((int)1e9 + 7);
        return ans;
    }
};
