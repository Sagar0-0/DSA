class Solution {
public:
    int minRefuelStops(int target, int startFuel, vector<vector<int>>& stations) {
        priority_queue<int> pq;
        stations.push_back({target, 0});
        int pumps=0;
        for(int i=0;i<stations.size();i++){
            startFuel -= (stations[i][0] - (i==0?0:stations[i-1][0]));
            while(startFuel < 0 and !pq.empty()){
                startFuel += pq.top();
                pq.pop();
                pumps++;
            }           
            if(startFuel < 0) return -1;
            pq.push(stations[i][1]);
        }
        return pumps;
    }
};
