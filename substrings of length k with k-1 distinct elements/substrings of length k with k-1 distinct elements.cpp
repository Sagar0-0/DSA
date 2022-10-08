class Solution {
  public:
    int countOfSubstrings(string S, int K) {
        // code here
        int ans = 0;
        map<char, int> mp;
        
        for(int i=0; i<K-1; i++)
            mp[S[i]]++;
        
        int j = 0;
        
        for(int i=K-1; i<S.length(); i++)
        {
            mp[S[i]]++;
            
            if(mp.size() == K-1)
                ans++;
                
            mp[S[j]]--;
            
            if(mp[S[j]] == 0)
                mp.erase(S[j]);
            
            j++;
        }
        
        return ans;
    }
};
