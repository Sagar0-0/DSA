class Solution {
public:
    #define ps pair<int, string>
   class comp {
  public:
    bool operator() (const ps &p1, const ps &p2) {
      if(p1.first == p2.first) return p1.second < p2.second;
      
      return p1.first > p2.first;
    }
   }; 
    vector<string> topKFrequent(vector<string>& words, int k) {
        int n=words.size();
        
        unordered_map<string,int>map;
        for(auto x:words){
            map[x]++;
        }
        
        priority_queue<ps,vector<ps >,comp>pq;
        
        for(auto x:map){
            pq.push({x.second,x.first});
            if(pq.size()>k) pq.pop();
        }
        vector<string>ans(k);
        while(k--){
            ans[k]=pq.top().second;
            pq.pop();
        }
        return ans;
    }
};
