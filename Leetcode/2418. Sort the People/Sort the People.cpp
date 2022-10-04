class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        vector<pair<int,string>> v;
        for(int i =0;i<names.size();i++){
            v.push_back({heights[i],names[i]});
        }
        sort(v.begin(),v.end(),greater<>());
        vector<string>m;
        for(auto &it:v){
            m.push_back(it.second);
        }
        return m;
    }
};
