class Solution {
  public:
    vector<vector<string>> mergeDetails(vector<vector<string>>& details) {
       vector<vector<string>>vv;
       for(int i=0;i<details.size();i++)
       {
           if(details[i][0]!="-")
           {
               set<string>s;
               vector<string>v;
               for(int j=1;j<details[i].size();j++)
               {
                   s.insert(details[i][j]);
               }
               for(int j=i+1;j<details.size();j++)
               {
                   if(details[j][0]!="-")
                   {
                       for(int k=1;k<details[j].size();k++)
                       {
                           auto pos=s.find(details[j][k]);
                           if(pos!=s.end())
                           {
                               details[j][0]="-";
                               for(int k=1;k<details[j].size();k++)
                               {
                                   s.insert(details[j][k]);
                               }
                           }
                       }
                   }
               }
               v.push_back(details[i][0]);
               for(auto i=s.begin();i!=s.end();i++) v.push_back(*i);
               vv.push_back(v);
           }
       }
       sort(vv.rbegin(),vv.rend());
       return vv;
   }
};
