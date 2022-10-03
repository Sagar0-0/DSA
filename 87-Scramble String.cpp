class Solution {
public:
    map<pair<string,string>,bool>m;
    bool solve(string a,string b){
        if(a.length()<1) return 0;
        if(a.length()!=b.length()) return 0;
        if(a==b) return 1;
        if(m.find({a,b})!=m.end()) return m[{a,b}];
        int n=a.length();
        for(int i=1; i<n; i++){
            if(solve(a.substr(0, i),b.substr(0,i)) && solve(a.substr(i,n-i),b.substr(i,n-i))) 
               return m[{a,b}] = true;
            if(solve(a.substr(0, i),b.substr(n-i,i)) && solve(a.substr(i,n-i),b.substr(0,n-i)))
                return m[{a,b}] = true;
        }
        return m[{a,b}] = false;
    }
    bool isScramble(string s1, string s2) {
        if(s1.length()!=s2.length()) return false;
        if(s1==s2) return true;
        return solve(s1,s2);
    }
};
