#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
    #define ll long long int

    
    private:
    ll solve(string& s,int i,int j,vector<vector<ll>> &dp){
         int mod =1e9+7;
        
        if(i==j){
            return 1;
        }
        
        if(i>j){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        
        if(s[i] == s[j]){
            dp[i][j] = ( 1 + solve(s,i+1,j,dp) + solve(s,i,j-1,dp) )%mod;
        }else{
            dp[i][j] = ((solve(s,i+1,j,dp) + solve(s,i,j-1,dp) - solve(s,i+1,j-1,dp))%mod+mod)%mod ; 
        }
        
        
        return dp[i][j];
    }
    public:
    /*You are required to complete below method */
    ll  countPS(string str)
    {
       //Your code here
       int n = str.size();
       
       vector<vector<ll>> dp(n,vector<ll>(n,-1));
       
       return solve(str,0,n-1,dp);
       
    }
     
};

//{ Driver Code Starts.
// Driver program
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string str;
        cin>>str;
        Solution ob;
        long long int ans = ob.countPS(str);
        cout<<ans<<endl;
    } 
}
