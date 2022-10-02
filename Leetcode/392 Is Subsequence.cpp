class Solution {
public:
    bool isSubsequence(string s, string t) {
        int s_len=s.size();
        int t_len=t.size();
        int j=0;
        for(int i=0;i<t_len && j<s_len ;i++)
        {
            if(t[i]==s[j]) j++;
        }
        return (j==s_len);
    }
};
