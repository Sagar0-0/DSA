class Solution {
public:
    string longestPalindrome(string s)
    {
        string ans="";
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            int lo,hi;
            lo=hi=i;
            while(lo>=0&&hi<s.length()&&(s[lo]==s[hi]))
                {
                    if((hi-lo+1)>len)
                    {
                        ans=s.substr(lo,hi-lo+1);
                        len=hi-lo+1;
                    }
                    lo--;
                    hi++;
                }
            lo=i,hi=i+1;
            while(lo>=0&&hi<s.length()&&s[lo]==s[hi])
            {
                if((hi-lo+1)>len)
                    {
                        ans=s.substr(lo,hi-lo+1);
                        len=hi-lo+1;
                    }
                    lo--;
                    hi++;
            }
        }
    return ans;    
    }   
};
