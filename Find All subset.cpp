/*
Find all distinct subset (or subsequence) sums
MediumAccuracy: 42.81%Submissions: 15651Points: 4
Given a set of integers, find all distinct sums that can be generated from the subsets of the given sets.
 
*/
// with dp 

class Solution {
public:

    int solve(vector<int>&nums,int n,vector<vector<int>> &dp,set<int>&st,int sum)
    {
        if(n==0)
        {
            st.insert(sum);
            return 0;
        }
        
        if(dp[n][sum]!=-1)return dp[n][sum];
        
        dp[n][sum] = solve(nums,n-1,dp,st,sum+nums[n-1]);
        dp[n][sum] =solve(nums,n-1,dp,st,sum);
            
        
    }
    
	vector<int> DistinctSum(vector<int>nums){
	    // Code here
	    int totalSum=0;
	    
	    for(int i=0;i<nums.size();i++)
	    {
	        totalSum=totalSum+nums[i];
	    }
	    
	    int n=nums.size();
	    
	    vector<vector<int>>dp(n+1,vector<int>(totalSum+1,-1));
	    
	    int sum=0;
	    set<int>st;
	    solve(nums,n,dp,st,sum);
	    
	    vector<int>ans;
	    
	    for(auto it:st)
	    {
	        ans.push_back(it);
	    }
	    
	    return ans;
	    
	}
};
