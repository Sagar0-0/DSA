class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& words) {
        
        
        set<string>s;
        
        if( find(words.begin(),words.end(),endWord)==words.end())
            return 0;
        for(auto word:words)
            s.insert(word);
        
        queue<string>q;
        q.push(beginWord);
        
        int ans = 0;
        while(!q.empty())
        {
            ans++;
            int n = q.size();
            while(n--)
            {
                string s1 = q.front();
                q.pop();
                
                for(int i=0;i<s1.size();i++)
                {
                    string t = s1;
                    
                    for(char c = 'a';c<='z';c++)
                    {
                        t[i] = c;
                        
                        if(t==s1)
                            continue;
                        
                        if(t==endWord)
                            return ans+1;
                        
                        if(s.find(t)!=s.end())
                        {
                            q.push(t);
                            s.erase(t);
                        }
                    }
                    
                }
                
                
            }
        }
        
        return 0;
    }
};