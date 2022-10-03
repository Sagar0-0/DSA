/*This code is contributed by mr-optimizer (https://github.com/mr-optimizer) */
class Solution {
public:
    int memo[501][501];
    int dp(string word1, string word2, int i, int j) {
        if (i == 0)return j;
        if (j == 0)return i;
        if (memo[i][j] != -1)return memo[i][j];
        if (word1[i - 1] == word2[j - 1]) {
            return memo[i][j] = dp(word1, word2, i - 1, j - 1);
        } else {
            return memo[i][j] = 1 + min(dp(word1, word2, i - 1, j), min(dp(word1, word2, i, j - 1), dp(word1, word2, i - 1, j - 1)));
        }
    }
    int minDistance(string word1, string word2) {
        memset(memo, -1, sizeof(memo));
        return dp(word1, word2, word1.size(), word2.size());
    }
};
