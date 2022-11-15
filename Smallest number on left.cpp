//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    vector<int> leftSmaller(int n, int a[]){
        // code here
        stack<int>s;
        vector<int>ans;                             //to store the answer
        
        for(int i=0;i<n;i++){
            
            if(s.empty())                           //if all element are greater or for the first element
                ans.push_back(-1);
                
            else if(s.top()<a[i])
                ans.push_back(s.top());
                
            else if(s.top()>=a[i]){                 //Remove elements from stack which are greater than current element
                while(!s.empty() && s.top()>=a[i])
                    s.pop();                        // poping till we find smaller element
                    
                if(s.empty())
                    ans.push_back(-1);
                else
                    ans.push_back(s.top());
            }
            
            s.push(a[i]);                           //push the element
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[n];
        for(int i = 0;i < n;i++)
            cin>>a[i];
        
        Solution ob;
        vector<int> ans = ob.leftSmaller(n, a);
        for(int i = 0;i < n;i++)
            cout<<ans[i]<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends
