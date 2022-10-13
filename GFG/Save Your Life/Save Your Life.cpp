class Solution{
public:
      string maxSum(string w,char x[], int b[],int n){
          // code here    
          map<char, int> mp;
          
          for(int i=0; i<26; i++)
          {
              mp['a'+i] = 'a'+i;
              mp['A'+i] = 'A'+i;
          }
          
          for(int i=0; i<n; i++)
            mp[x[i]] = b[i];
          
          int sum = 0, maxSum = mp[w[0]];
          string ans = "", Ans = "";
          
          for(char it : w)
          {
              sum += mp[it];
              ans.push_back(it);
              
              if(sum >= maxSum)
              {
                  Ans = ans;
                  maxSum = sum;
              }
                
              if(sum <= 0)
              {
                  ans.clear();
                  sum = 0;
              }
          }
          
          return Ans;
      }
};
