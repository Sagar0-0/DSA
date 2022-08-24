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
