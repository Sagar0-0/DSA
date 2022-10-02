#include<bits/stdc++.h>
using namespace std;

#define MOD 1000000007
class Solution {
public:
    long long solve(int dice, int faces, int target, vector<vector<long long>> &dp){
        //         top down appr
        if(target <0) return 0;
        if(dice ==0 and target != 0 || target==0 and dice !=0) return 0;
        if(target ==0 and dice ==0) return 1;
        if(dp[dice][target] != -1)
            return dp[dice][target];
        long long res =0;
        for(int i =1; i<= faces; i++){
            res = (res + solve(dice - 1, faces, target - i, dp))%MOD;
        }
        return dp[dice][target] = res;
    }
    int numRollsToTarget(int n, int k, int target) {
        vector<vector<long long>> dp(n + 1, vector<long long>(target + 1, -1));
        return solve(n, k, target, dp);
    }
};