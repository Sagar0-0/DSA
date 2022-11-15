#include<bits/stdc++.h>
using namespace std; 
class Solution{
public:
    int minLength(string s, int n) {
        // code here
        vector<string>v={"12","21","34","43","56","65","78","87","09","90"};
        int n1=n;
        stack<char>st;
        for(int i=0;i<s.size();i++)
        {
            st.push(s[i]);
            if(st.size()>1)
            {
                string temp="";
                char a=st.top(); st.pop();
                char b=st.top(); st.pop();
                temp+=a;
                temp+=b;
                if(find(v.begin(),v.end(),temp)==v.end())
                {
                    st.push(b);
                     st.push(a);
                }
            }
        }
        return st.size();
    } 
};
int32_t main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;

        string s;
        cin >> s;

        Solution obj;
        cout << obj.minLength(s, n) << "\n";
    }
    return 0;
}