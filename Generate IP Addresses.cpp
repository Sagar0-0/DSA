class Solution{
  public:
    bool isValid(string op)
    {
        string temp = "";
        int count = 0;
        for(int i=0; i<op.size(); i++)
        {
            if(op[i] == '.')
            {
                if(temp[0] == '0')
                {
                    for(int i=1; i<temp.size(); i++)
                    {
                        if(temp[i] == 0)
                            continue;
                        else
                            return false;
                    }
                }
                long long a = stoll(temp);
                if(a > 255)
                    return false;
                temp.clear();
                count++;
            }
            else
                temp.push_back(op[i]);
        }
        
        if(temp[0] == '0')
        {
            for(int i=1; i<temp.size(); i++)
            {
                if(temp[i] == 0)
                    continue;
                else
                    return false;
            }
        }
        
        long long a = stoll(temp);
        if(a <= 255 && count == 3)
            return true;
        else
            return false;
        
    }
    
    void solve(string ip,string op,vector<string> &ans)
    {
        if(ip.size() == 0)
        {
             if(isValid(op))
                ans.push_back(op);
            
            return;
        }
        
        if(op.size() == 0)
        {
           op.push_back(ip[0]);
           ip.erase(ip.begin()+0);
        }
        
        if(op[op.size()-1] == '.')
        {
            string opt = op + ip[0];
            ip.erase(ip.begin()+0);
            solve(ip,opt,ans);
        }
        else
        {
            
            string op1 = op + '.';
            solve(ip,op1,ans);
            string op2 = op + ip[0];
            ip.erase(ip.begin()+0);
            solve(ip,op2,ans);
        }
        
           
    }
    
    vector<string> genIp(string &s) {
        vector<string> ans;
        if(s.size() < 4)
            ans.push_back("-1");
        else
        {
            string op = "";
            solve(s,op,ans);
            if(ans.size() == 0)
                 ans.push_back("-1");
        }
        
        return ans;
    }

};

// Another approach

// class Solution{
//   public:
//   vector<string> ans;
  
//     bool isValidIp(string &s)
//     {
//         string temp = "";
        
//         for(int i=0; i<s.length(); i++)
//         {
//             if(s[i] != '.')
//                 temp.push_back(s[i]);
                
//             else
//             {
//                 if(temp.empty() or (temp.length() > 1 and temp[0] == '0'))
//                     return false;
                
//                 if(stoll(temp) > 255)
//                     return false;
                
//                 temp = "";
//             }
//         }
        
//         if(temp.empty() or (temp.length() > 1 and temp[0] == '0'))
//             return false;
            
//         if(stoll(temp) > 255)
//             return false;
            
//         return true;
//     }
    
//     void solve(string &s, int i, int cnt)
//     {
//         if(cnt == 3)
//         {
//             if(isValidIp(s))
//             ans.push_back(s);
            
//             return;
//         }
        
//         for(int p=i+1; p<s.length() and (p-i)<=4; p++)
//         {
//             s.insert(s.begin()+p, '.');
            
//             solve(s, p, cnt+1);
            
//             s.erase(s.begin()+p);
//         }
//     }
    
//     vector<string> genIp(string &s) {
//         // Your code here
//         ans.clear();
        
//         if(s.length() >= 4 and s.length() <= 12)
//         solve(s, 0, 0);
        
//         if(ans.empty())
//         ans.push_back({"-1"});
        
//         return ans;
//     }

// };
