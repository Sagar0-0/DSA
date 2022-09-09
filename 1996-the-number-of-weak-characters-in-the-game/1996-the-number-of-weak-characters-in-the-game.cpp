#include<bits/stdc++.h>
using namespace std;

class Solution{
    public:
    // using hash_map + STL
    // approach
    /*
    rearrange order of attach in asc order
    count weak chars(those defense less than curr maxi defense)
    update maxidefense
    */
   int numberOfWeakCharacters(vector<vector<int>>& properties){
    int WC =0; // final res to be returned, WC = weak chars
    // return maxiDefense since 1 <= defense[i] <= 10^5, set inti value to x sinec x <1
    int maxiDefense =0;
    // using hash_map to map the attack and defense with greater<int> as a key compare
    map<int, vector<int>, greater<int>> mp;
    for(auto x : properties) mp[x[0]].push_back(x[1]);
    // foreach attack
    for(auto x : mp){
        // count num of weakchar and add it to WC, count_if() returns the number of elements in the given sequence for which the comparator function (third parameter) returns true.
        // STL iterator ==> x.second.begin() => __first, x.second.end() => __last,  [&](int currDefense) => predicate 
        WC+= count_if(x.second.begin(), x.second.end(), [&](int currDefense){
            return currDefense < maxiDefense;
        });
        // update maxidefense which is the maxi value of currdefense
        maxiDefense = max(maxiDefense, *max_element(x.second.begin(), x.second.end()));

    }
    return WC;


   }
};
