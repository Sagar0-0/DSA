class Solution {
  public:
    int countOfSubstrings(string S, int K) {
        int ans = 0, cnt_chars = 0;
        
        vector<int> v(26,0);
        for(int i=0;i<K;i++){
            int p = S[i] - 'a';
            if(v[p]==0) cnt_chars ++;
            v[p]++;
        }
        
        if(cnt_chars==K-1) ans++;
        
        for(int i=K;i<S.length();i++){
            int r = S[i] - 'a', l = S[i-K] - 'a';
            
            if(v[r]==0) cnt_chars++;
            v[r]++;
            
            if(v[l]==1) cnt_chars--;
            v[l]--;
            
            if(cnt_chars == K-1) ans++;
            // cout<<l<<" "<<r<<"\n";
        }
        
        return ans;
    }
};
