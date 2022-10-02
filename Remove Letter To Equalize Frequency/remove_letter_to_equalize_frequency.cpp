class Solution {
public:
    bool equalFrequency(string word) {
        vector<int> v;
        unordered_map<char, int> mp;
        for(char ch : word) mp[ch]++;
        for(auto x : mp){
            v.push_back(x.second);
        }
        sort(v.begin(), v.end());
        if(v.size() == 1) return 1;
        
        else if(v.size() == 2){
            if(v[0] == 1 and v[1] == 1) return 1;
            else if(v[1] - v[0] == 1) return 1;
            return 0;
        }
        
        else{
            if(v[0] == 1 and count(v.begin(), v.end(), v[0]) == v.size()) return 1;
            else if(v[0] == 1 and count(v.begin(), v.end(), v[0]) != v.size()){
                if(v.size() == 3 and v[v.size() - 1] == 2) return 1;
            }
            
            int sum = 0;
            for(int x : v) sum += x;
            
            if(sum == (v[0] * v.size() + 1)) return 1;
            else return 0;
        }
        return 0;
    }
};
