class Solution{
public:
    vector<vector<string>> displayContacts(int n, string contact[], string s)
    {
        // code here
        
        unordered_map<string,set<string>>dic;
        
        for(auto c=0;c<n;c++){
            for(int i=1;i<=contact[c].size();i++){
                dic[contact[c].substr(0,i)].insert(contact[c]);
            }
        }
        vector<vector<string>>ans(s.size(),vector<string>());
        
        
        for(int i=1;i<=s.size();i++){
            if(dic[s.substr(0,i)].size()==0){
                ans[i-1].push_back("0");
                continue;
            }
            for(auto j:dic[s.substr(0,i)])
                ans[i-1].push_back(j);
        }
        
        return ans;
    }
};
