//{ Driver Code Starts
//Initial template for C++
 
#include<bits/stdc++.h>
using namespace std; 

// } Driver Code Ends
//User function template for C++

class Solution{
public:
    int minLength(string s, int n) {
        // code here
        vector <string> v = {"12", "21", "34", "43", "56", "65", "78", "87", "09", "90"};
        stack<char>st;
        
        for(int i=0 ; i<n; i++){
            if(st.empty()){
                st.push(s[i]) ;
            }
            else{
                bool found = false ;
                
                for(auto it : v){
                    if(it[0] == st.top()  && it[1] == s[i]){
                        
                        st.pop() ;
                        found = true ;
                        break ;
                    }
                }
                if(!found)
                    st.push(s[i]) ;    
            }
        }
        return st.size() ;
    } 
};


//{ Driver Code Starts.

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
// } Driver Code Ends
