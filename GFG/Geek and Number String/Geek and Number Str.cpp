int minLength(string s, int n) {
        string temp="12 21 34 43 56 65 78 87 09 90";
      stack<char>st;
      st.push(s[0]);
      for(int i=1;i<n;i++){
          if(st.size()>0){
              string str;
               str+=st.top();
              str+=s[i];
              if(temp.find(str)!=string::npos){
                  st.pop();
              }else{
                  st.push(s[i]);
              }
          }else
          st.push(s[i]);
      }
      return st.size();
    } 