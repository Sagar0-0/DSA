class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        
        // 1.
        // unordered_map<int, int> mp;
        // for(int i=0;i<nums.size();i++){
        //     mp[nums[i]]++;
        // }
        // vector<int> ans;
        // while(ans.size() < k){
        //     int f = INT_MIN;
        //     int t;
        //     for(auto it : mp){            
        //         if(f < it.second){
        //             f = it.second;
        //             t = it.first;
        //         }
        //     }
        //     if(ans.size() < k)
        //         ans.push_back(t);
        //     mp.erase(t);
        // }
        // return ans;
        
        
      // by default the priority queue will sort the first value of pairs in descending order
        // 2. 
        unordered_map<int, int> mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        vector<int> ans(k, 0);
        priority_queue<pair<int, int>> pq;
        for(auto it : mp){
            pair<int, int> p;
            p.first = it.second;
            p.second = it.first;
            pq.push(p);
        }
        int i=0;
        while(i<k){
            ans[i] = pq.top().second;
            pq.pop();
            i++;
        }
        return ans;
    }
};
