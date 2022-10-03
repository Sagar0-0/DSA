class Solution {
public:
    string bin(int n) { string s; while (n > 0) { char c = n % 2 + '0'; s.push_back(c); n /= 2; } return s;}
    int longestSubsequence(string s, int k) {
        string t=bin(k);
        int i=s.length()-1,j=0;
        int ans=0;
        if(s.length()<t.length())return s.length();
        int ind=-1;
        if(s[s.length() - t.length()]=='0') {
            ind=s.length()-t.length()-1;
            ans=t.length();
            while(ind>=0){
                if(s[ind]=='0') ans++;
                ind--;
            }
            return ans;
        }
        ind=s.length()-t.length()-1;
        string d=s.substr(ind+1);
        reverse(t.begin(),t.end());
        ans=t.length()-1;
        if(d<=t)ans++;
        while(ind>=0){
            if(s[ind]=='0') ans++;
            ind--;
        }
        return ans;
    }
};
