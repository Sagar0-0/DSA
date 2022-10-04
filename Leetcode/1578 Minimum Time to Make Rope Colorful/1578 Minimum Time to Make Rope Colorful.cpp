#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
//         initializing 2 pointers
        int totalTime =0, i =0, j =0;
        while(i<neededTime.size() && j < neededTime.size()){
            int currTotal =0, currMax =0;
//             find all balloons having the same color as the balloon indexed[i], record the total removal time & maxi removal time
            while(j < neededTime.size() && colors[i]== colors[j]){
                currTotal+= neededTime[j];
                currMax = max(currMax, neededTime[j]);
                j++;
            }
//             once we reach the end of the curr group, add the cost of this group to total_time, & reset 2 pointers
            totalTime+=currTotal-currMax;
            i=j;
        }
        return totalTime;
//         TC: O(n), SC: O(1)
    }
};