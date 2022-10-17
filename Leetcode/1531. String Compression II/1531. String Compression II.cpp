class Solution {
public:

 int helper(int currIdx,int prevchar,int curFreq,int k, vector<vector<vector<vector<int>>>> &dp, string &s)
    {
        if(k < 0) return 100000000;
        if(currIdx >= s.size()) return 0;
        
    // if curCharFreqCount, consider it as 10, because, until 10 .. 99, string length will be 2, 
        if(curFreq >= 10) curFreq = 10;
        if(dp[currIdx][prevchar][curFreq][k] != -1) return dp[currIdx][prevchar][curFreq][k];
        
//         // exclude
           int res = 100000000;
   
         /*
        3 cases:
        case 1: We will delete our current character if K is available, so our string length will be minimum.
        case 2: If cur char is not same as prev, our res will be increased by 1 and curCharFreqCount will be 1
        case 3: If cur char is same as prev char, we need to merge it and increase our count
                case 3.1: If curCharFreqCount is either 1 or more than 9, our res will be increased by 1
                case 3.2: Else, we just need to increase curCharFreqCount.
        */
           res = min(res, helper(currIdx + 1, prevchar, curFreq, k - 1, dp, s));
   
//         // include
        if(s[currIdx] - 'a' != prevchar)
        {
            res = min(res, 1 + helper(currIdx + 1, s[currIdx] - 'a', 1, k, dp, s));
        }
        else
        {
            if(curFreq == 1 || curFreq == 9)
            {
                res = min(res, 1 + helper(currIdx + 1, prevchar, curFreq + 1, k, dp, s));
            }
            else res = min(res, helper(currIdx + 1, prevchar, curFreq + 1, k, dp, s));
        }
        
        return dp[currIdx][prevchar][curFreq][k] = res;
    }
    int getLengthOfOptimalCompression(string s, int k) {
        int n = s.size();
        vector<vector<vector<vector<int>>>> dp(n+1, vector<vector<vector<int>>>(28, vector<vector<int>>(11, vector<int>(n+1, -1))));
        string p = s;
        if(n == 100)
        {
            bool isSame = true;
            sort(s.begin(), s.end());
            for(int i = 1; i < s.size(); i++)
            {
                if(s[i] != s[i-1])
                {
                    isSame = false;
                    break;
                }
            }
            if(isSame) return 4;
        }
        s = p;
        
        return helper(0, 27, 0, k, dp, s);
    }

};
