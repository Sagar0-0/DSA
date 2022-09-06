#include<bits/stdc++.h>
using namespace std;

class Solution{
public:
    long long findMinSum(vector<int> &A,vector<int> &B,int N){
        long long res =0;
        sort(A.begin(), A.end());
        sort(B.begin(), B.end());
        for(int i =0; i<N; i++)
        res+=abs(A[i]-B[i]);
        return res;
    }
    // TC: O(N)
};