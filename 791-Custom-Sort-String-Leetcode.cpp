class Solution {
public:
    string customSortString(string order, string s) 
    {
        unordered_map<char,int>mp;
        for(auto it:s)
            mp[it]++;
        
        string ans="";
        for(int i=0;i<order.size();++i)
        {
            auto x=find(s.begin(),s.end(),order[i]);
            if(x!=s.end())
            {
                while(mp[order[i]]--)
                    ans+=order[i];
            }  
        }
        
        for(int i=0;i<s.size();++i)
        {
            auto x=find(order.begin(),order.end(),s[i]);
            if(x==order.end())
                ans+=s[i];
        }
        return ans;
    }
};
