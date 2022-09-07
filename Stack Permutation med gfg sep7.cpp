#include <bits/stdc++.h>
using namespace std;

class Solution{
public:
    int isStackPermutation(int N,vector<int> &A,vector<int> &B){
        // creating stack and a variable to traverse through 'B' variable
        stack<int>st; int j=0;
        
        for(int i =0; i<N; i++){
            // pushing/inserting into stack 1st
            st.push(A[i]);
            while(!st.empty()){
                // checking if the inserted element is equal to B's element, if matched pop and increment else break
                if(st.top()==B[j]){
                    // pop until it is matching & incrementing j to match next B element
                    j++; st.pop();
                }
                else break;
            }
        }
        // if stack empty i.e all elements satisfies with B return true(1) 
        if(st.empty()) return 1;
        // if any element left in the stack i.e !stack.empty return false 
        else return 0;
    }
};

int main(){
    
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> a(n),b(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        for(int i=0;i<n;i++){
            cin>>b[i];
        }
        Solution ob;
        cout<<ob.isStackPermutation(n,a,b)<<endl;
    }
    
    return 0;
}