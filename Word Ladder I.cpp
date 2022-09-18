class Solution {
public:
int count(string a, string b){
    if(a.length()!=b.length()) return -1;
    
    int cnt = 0;
    for(int i=0;i<a.length();i++){
        if(a[i]!=b[i]) cnt++;
    }
    return cnt;
}
    int wordLadderLength(string startWord, string targetWord, vector<string>& wordList) {
        if(startWord==targetWord){
            for(int i=0;i<wordList.size();i++){
                if(wordList[i]==targetWord) return 1;
            }
        }
        
        queue<pair<string,int>> st;
        st.push({startWord, 1});
        set<string> sr;
        
        while(!st.empty()){
            auto tp = st.front();
            sr.insert(tp.first);
            if(tp.first==targetWord) return tp.second;
            st.pop();
            
            for(int i=0; i<wordList.size();i++){
                if(sr.find(wordList[i])==sr.end() && count(wordList[i], tp.first)==1){
                    st.push({wordList[i], tp.second+1});
                }
            }
        }
        
        return 0;
    }
};
