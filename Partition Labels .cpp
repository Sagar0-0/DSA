class Solution {
public:
    vector<int> partitionLabels(string s) {
        unordered_map<char,int> mp;
        for(int i=0;i<s.size();i++)
        {
            mp[s[i]]=i;
        }
        vector<int> ans;
        int prev=-1,mx=0;
        for(int i=0;i<s.size();i++)
        {
            mx=max(mx,mp[s[i]]);
            if(i==mx)
            {
                ans.push_back(mx-prev);
                prev=mx;
            }
        }
        return ans;
    }
};
