#include<bits.stdc++.h>
using namespace std;

class Solution {
    // TC: O(N * (logN + logK)) 
// SC: O(N + K)
// where N = total number of candidates & K = size of team
public:
    int maxPerformance(int n, vector<int>& speed, vector<int>& efficiency, int k) {
        int MOD = 1e9 + 7;
        vector<pair<int, int>> candidates(n);
        // building pair { efficiency, speed } to sort it later
        for (int i = 0; i < n; i++) candidates[i] = { efficiency[i], speed[i] };
        // sort candidates in dsc
        sort(candidates.rbegin(), candidates.rend());
        // Using Example 1: 
        // speed: [2, 10, 3, 1 ,5, 8] and efficiency: [5, 4, 3, 9, 7, 2]
        // after sort, it becomes
        // candidates: [{9, 1}, {7 ,5}, {5, 2}, {4, 10}, {3, 3}, {2, 8}]
        long speedSum = 0, ans = 0;
        // we use priority queue here with greater<int> to store the sum
        // i.e min heap (the smallest element goes on the top)
        priority_queue <int, vector<int>, greater<int>> pq;
        // iterate each pair
        for (auto& [e, s] : candidates) {
            // put the speed to priority queue
            pq.push(s);
            // add to speedSum
            speedSum += s;
            // we only need to choose at most k engineers
            // hence if the queue size is greater than k
            // we need to remove a candidate
            if (pq.size() > k) {
                // who to remove? of course the one with smallest speed
                speedSum -= pq.top();
                pq.pop();
            }
            // a team is formed now, calculate the performance
            ans = max(ans, speedSum * e);
        }
        return ans % MOD;
    }
};