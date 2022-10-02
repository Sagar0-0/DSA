class Solution{
public:
    unordered_map<string, int> mp;
    vector<string> res;
    void solve(int indx, int sz, string s, string x){
        if(s==""){
            res.push_back(x); // first this will store (cat sand dog) then it will 
            // call previous solve() function
            return;
        }
        
        string t = "";
        
        if(x.size() != 0){
            x += " ";
        }
        
        for(int i=0; i<sz; i++){
            t += s[i];
            if(mp[t] != 0){
                solve(0, sz, s.substr(i+1), x + t); // after coming from return above
                // this will add more characters and check if it is in map or not
                // and this process will goes on until all strings are not found out.
            }
        }
    }
    vector<string> wordBreak(int n, vector<string>& dict, string s)
    {
        // code here
        int sz = s.size();
        mp.clear();
        res.clear();
        for(string i:dict){
            mp[i]++;
        }
        solve(0, sz, s, "");
        return res;
    }
};
