class Solution {
public:
    string minRemoveToMakeValid(string s) {
        string ans = "";
        int n = s.size();
        stack<int> st;
        int i = 0;
        // we are removing open bracket if extra and marking them with # and finally not including the character # in the ans string
        while(i < n){
            if(s[i] == '(') st.push(i);
            else if(s[i] == ')'){
                if(st.empty()){
                    s[i] = '#';
                }else{
                    st.pop(); // removing the relavent open bracket for closing bracket and finally we will be left with extra open brackets and we will mark them as #
                }
            }
            i++;
        }
        // here we are marking extra open brackets as #
        while(!st.empty()){
            s[st.top()] = '#';
            st.pop();
        }
        i = 0;
        while(i<n){
            if(s[i] != '#') ans += s[i];
            i++;
        }
        return ans;
    }
};
