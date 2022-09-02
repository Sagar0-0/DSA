#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int minimumCostOfBreaking(vector<int> X, vector<int> Y, int M, int N){
        //Write your code here
        sort(X.begin(), X.end(), greater<int>());
        sort(Y.begin(), Y.end(), greater<int>());
        
        int i =0,j =0, cost =0, hor=1, ver =1;
        while(i<X.size() || j <Y.size()){
            if(i<X.size() && j<Y.size()){
                if(X[i]<=Y[j]){
                    // cut horixontally
                    cost+=(Y[j++]*hor); ver++;
                }else{
                    cost+=(X[i++]*ver); hor++;
                }
            }
            else if(i<X.size()){
                cost+=(X[i++]*ver);
            }else if(j<Y.size()){
                cost+=(Y[j++]*hor);
            }
        }
        return cost;
    }
};