class Solution {
public:
    vector<string>ans;
    void backTrack(int i, string &s, string t, vector<string>& wordDict){
        if(i == s.size()){
            t.pop_back();
            ans.push_back(t);
            return;
        }
        for(auto &w : wordDict){
            int n = w.size();
            string str = s.substr(i, n);
            
            if(w == str){
                backTrack(i + n, s, t + str + " ", wordDict);
            }
        }
    }
    vector<string> wordBreak(string s, vector<string>& wordDict) {
        backTrack(0, s, "", wordDict);
        return ans;
    }
};
