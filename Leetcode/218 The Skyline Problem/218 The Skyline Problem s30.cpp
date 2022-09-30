#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<vector<int>> getSkyline(vector<vector<int>>& buildings) {
       vector<vector<int>> res;
        multiset<int> pq{0};
        
        vector<pair<int, int>> points;
        
        for(auto b: buildings){
            points.push_back({b[0], -b[2]});
            points.push_back({b[1], b[2]});
        }
        
        sort(points.begin(), points.end());
        
        int ongoingHeight = 0;
        
        for(int i = 0; i < points.size(); i++){
            int currentPoint = points[i].first; // x coordinate
            int heightAtCurrentPoint = points[i].second; // ht
            
            if(heightAtCurrentPoint < 0){
                pq.insert(-heightAtCurrentPoint);
            } else {
                pq.erase(pq.find(heightAtCurrentPoint));
            }
            
            auto pqTop = *pq.rbegin();
            if(ongoingHeight != pqTop){
                ongoingHeight = pqTop;
                res.push_back({currentPoint, ongoingHeight});
            }
        }
        
        return res; 
    }
};