class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        if(colors.length() != neededTime.size()) return -1;
                int time = 0; int maxTime;
            for(int i=0; i<colors.length(); i++) {
                   if(i>0 && colors[i]!=colors[i-1])
                           maxTime =0;
                 
                  time += min(maxTime, neededTime[i]);
                  maxTime = max(maxTime, neededTime[i]);  
            }
            
            return time;
    }
};