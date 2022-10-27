/*
Given two numbers M and N, which represents the length and breadth of a paper, the task is to cut the paper into squares of any size and find the minimum number of squares that can be cut from the paper.

Example 1:

Input: M = 36, N = 30
Output: 5
Explanation: 
3 (squares of size 12x12) + 
2 (squares of size 18x18)
Example 2:

Input: M = 4, N = 5
Output: 5
Explanation: 
1 (squares of size 4x4) + 
4 (squares of size 1x1)
*/


// it is a application of matrix chain multiplication 

class Solution{

	public:
	
	int solve(int m , int n , vector<vector<int>>&t)
	{
	    if(m==n) return 1;
	    
	    if(m<0 or n<0)return INT_MAX;
	    
	    
	    if(t[m][n]!=INT_MAX) return t[m][n];
	    
	    
	    // for horizontal cut
	    for(int i=1;i<m;i++)
	    {
	         t[m][n]=min(t[m][n],solve(i,n,t)+solve(m-i,n,t));
	    }
	   
	    // for virticle cut
	    for(int i=1;i<n;i++)
	    {
	        t[m][n]=min(t[m][n],solve(m,i,t)+solve(m,n-i,t));
	    }
	    
	    return t[m][n];
	    
	}
	
	
	int minCut(int M, int N)
	{
        // Your code goes here
    
        // we initialized it with INT MAX because we are taking minimum form dp and our calculation 
        // if we initialized it with -1 it will give us wrong answer thats why we use INT  MAX
        vector<vector<int>>t(M+1,vector<int>(N+1,INT_MAX));
        
        return solve(M,N,t);
        
        
	}
};
