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
                          if(s.count(details[j][k]))
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
              for(string it : s) v.push_back(it);


              vv.push_back(v);
          }
      }
      sort(vv.rbegin(),vv.rend()); 
      return vv;
   }
};
