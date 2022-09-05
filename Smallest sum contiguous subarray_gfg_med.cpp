#include<bits/stdc++.h>
using namespace std;
// using kadane's algorithm O(N)
class Solution{
  public:
  int smallestSumSubarray(vector<int>& a){
      //Code here
    //   usign kadane's algo
    int ans =INT_MAX, currSum = 0;
    for(auto&i : a){
        currSum+=i;
        ans = min(ans, currSum);
        if(currSum>0) currSum =0;
    }
    return ans;
  }
};