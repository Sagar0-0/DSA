#include <vector>
#include <bits/stdc++.h>

using namesppace std;

class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int totalGas=0, currGas=0, ans=0; 
        
        for(int i=0; i<gas.size(); i++){
            totalGas += gas[i]-cost[i];
            currGas += gas[i]-cost[i];
            
            if(currGas < 0) currGas=0, ans=i+1;
        }
        return (totalGas < 0)? -1 : ans;
    }
};