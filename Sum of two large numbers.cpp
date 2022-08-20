class Solution {
  public:
    string findSum(string X, string Y) {
        // Your code goes here
        string ans = "";
        
        int n = X.length()-1, m = Y.length()-1, rem = 0;
        
        while(n >= 0 and m >= 0)
        {
            int cur = (X[n--]-'0') + (Y[m--]-'0') + rem;
            rem = cur/10;
            cur = cur%10;
            
            ans.push_back('0'+cur);
        }
        
        while(n >= 0)
        {
            int cur = (X[n--]-'0') + rem;
            rem = cur/10;
            cur = cur%10;
            
            ans.push_back('0'+cur);
        }
        
        while(m >= 0)
        {
            int cur = (Y[m--]-'0') + rem;
            rem = cur/10;
            cur = cur%10;
            
            ans.push_back('0'+cur);
        }
        
        if(rem)
        ans.push_back('0'+rem);
        
        while(ans.back() == '0')
        ans.pop_back();
        
        if(ans.empty())
        return "0";
        
        reverse(ans.begin(), ans.end());
        
        return ans;
    }
};
