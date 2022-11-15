class Solution{
public:
    string decodedString(string s){

        string res="";

        stack<char> st;

        st.push(s[0]);

        for(int i=1;i<s.size();i++){

            if(s[i]==']'){

                while(!st.empty()&&st.top()!='['){

                    res=st.top()+res;

                    st.pop();

                }

                if(!st.empty())

                    st.pop();

                string rnum="";

                while(!st.empty()&&st.top()>='0'&&st.top()<='9'){

                    rnum=st.top()+rnum;

                    st.pop();

                }

                string sr=res;

                for(int j=0;j<stoi(rnum)-1;j++){

                    res+=sr;

                }

                for(auto x:res){

                    st.push(x);

                }

                res="";

            }

            else{

                st.push(s[i]);

            }

        }

        res="";

        while(!st.empty()){

            res=st.top()+res;

            st.pop();

        }

        return res;

    }
};
