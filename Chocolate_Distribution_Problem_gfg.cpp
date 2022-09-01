#include<bits/stdc++.h>
using  namespace std;


class Solution{
    public:
    long long findMinDiff(vector<long long> a, long long n, long long m){
        // sliding window approach
        if(n <m) return -1;
        long long minDiff = INT_MAX; // INT_MAX = +2147483647
        sort(a.begin(), a.end());
        int i =0, j =m-1;
        while(j <n){
            long long currDiff = a[j] - a[i];
            minDiff = min(minDiff, currDiff);
            i++, j++;
        }
        return minDiff;
    }
};
