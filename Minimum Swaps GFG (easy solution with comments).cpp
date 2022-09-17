//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
public:
    int minimumSwaps(int c[],int v[],int n,int k,int b,int T)
    {
            // code here
            int good_sheep = 0;         //to count how many sheeps can reach target
            int bad_sheep = 0;          //to count how many sheeps can NOT reach target
            int swap = 0;               //no. of sweeps
            
            for(int i=n-1;i>=0;i--){
                //check if it is able to reach destination
                
                if(v[i]*T + c[i] >= b){
                    
                    good_sheep++;
                    
                    //now check no of bad sheep infront of it and swap it with that
                    swap+=bad_sheep;
                }
                else{
                    bad_sheep++;
                }
                
                //check whether atleast k sheep reach the barn
                //if YES then break
                
                if(good_sheep>=k)   break;
            }
            if(good_sheep>=k)
                return swap;
                
            return -1;
    }
};

//{ Driver Code Starts.
int main(){
    int t=1,testcases=1;
    cin>>t;
    while(t>=testcases)
    {
        int n,k,b,T;
        cin>>n>>k>>b>>T;
        int c[n];
        int v[n];
        for(auto &j:c)
            cin>>j;
        for(auto &j:v)
            cin>>j;
        Solution s;
        int ans=s.minimumSwaps(c,v,n,k,b,T);
        cout<<ans<<endl;
        testcases++;
    }
    // TIME;
    return 0;
}
// } Driver Code Ends
