// { Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++

class Solution{
public:
 int countBits(int N, long long int A[])
   {
       int m=log2(*max_element(A,A+N));
       int mod=1000000007;
       int r=0;
       for(int i=0;i<=m;i++)
       {
         long long c=0;
           for(int j=0;j<N;j++)
           {
               if((A[j]&(1<<i))!=0)
               c++;
           }
           r=(r+2*c*(N-c))%mod;
       }
       return r;
   }
};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        long long int A[N];
        for(int i = 0;i < N; i++)
            cin>>A[i];
        
        Solution ob;
        cout<<ob.countBits(N, A)<<"\n";
    }
    return 0;
}  // } Driver Code Ends
