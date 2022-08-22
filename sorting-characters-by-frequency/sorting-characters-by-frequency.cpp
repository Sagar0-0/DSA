bool compare(const string& a, const string &b){
        return a.length() > b.length();
}
class Solution {
public:    
    string frequencySort(string s) {
        
        // 1.
        // unordered_map<char, int> mp;
        // for(int i=0;i<s.size();i++){
        //     mp[s[i]]++;
        // }
        // string ans="";
        // while(mp.size() > 0){
        //     int maxFre = -1;
        //     char ch;
        //     for(auto it : mp){
        //         if(maxFre < it.second){
        //             maxFre = it.second;
        //             ch = it.first;
        //         }
        //     }
        //     mp.erase(ch);
        //     for(int i=0;i<maxFre;i++){
        //         ans += ch;
        //     }
        // }
        // return ans;
        
        
        // 2.
        vector<string> freq(100,"");
        for (char a : s) freq[a-'0'] += a;
        sort(freq.begin(), freq.end(), compare);
        s = "";
        for (string str : freq) s += str;
        return s;
        // what it does is it is appending the string at the position of characters based on their indexes in alphabet order
            // like for tree it storing like for position 4(0-based indexing) ee, 19 - t and 17 - r
            // and then sorting based on length of strings.        
        
    }
};
