class Solution{
public:
    vector<int> prefixCount(int N, int Q, string li[], string query[])
    {
        // map is created to store the frequency of each string by string word
      // for example : abcd
      // then map will be like a - 1, ab - 1, abc - 1, abcd - 1
        unordered_map<string, int> mp;
        for(int i=0;i<N;i++){
            string temp = "";
            for(int j=0;j<li[i].size();j++){
                temp += li[i][j];
                mp[temp]++;
            }
        }        
        vector<int> v;
        for(int i=0;i<Q;i++){
            v.push_back(mp[query[i]]);
        }
        return v;
    }
};
