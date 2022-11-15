#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        int L =0, R = arr.size()-1;
        while(R-L >= k)
            if(x- arr[L] <=  arr[R]-x) R--;
            else L++;
        return vector<int>(arr.begin() + L, arr.begin() + R+1);
    }
};