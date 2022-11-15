//There are two approch for this Problem both approch are optimal also both uses O(n) Time Complexity

#include<bits/stdc++.h>
using namespace std;


//===========================Approch 1======================


class Solution {
public:
    int minCost(string s, vector<int>& time) {
        int ans = 0;
        int n = s.length();
        for(int i = 1; i < n; i++)
        {
            if(s[i] == s[i - 1])
            {
                ans += min(time[i], time[i - 1]); 
                time[i] = max(time[i], time[i - 1]); 
            }     
        }
        
        return ans;
    }
};


//===========================Approch 2 =========================




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
