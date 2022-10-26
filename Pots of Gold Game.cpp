/*Two players X and Y are playing a game in which there are pots of gold arranged in a line, 
each containing some gold coins. They get alternating turns in which the player can pick a pot
from one of the ends of the line. The winner is the player who has a higher number of coins at the end.
The objective is to maximize the number of coins collected by X, assuming Y also plays optimally.
Return the maximum coins X could get while playing the game. Initially, X starts the game.*/

// dp question done with recursion only 


class Solution {
public:


    int t[501][501];
    
    int solve(vector<int>&A,int start,int end)
    {
        if(start>end)
        return 0;
        // as the opponent we think of our worst so we are tkaing minimum of the outcome 
        // when opponent take start or opponent take end 
        
        if(t[start][end]!=-1)return t[start][end];
        
        // when we chose the start element 
        int incStart= A[start]+min(solve(A,start+2,end),solve(A,start+1,end-1));
        
        
        // when we take the end element 
        int incEnd=A[end]+min(solve(A,start+1,end-1),solve(A,start,end-2));
        
        
        // as we want our best so we take the best from them which in our hand 
        return t[start][end]= max(incStart,incEnd);
        
    }

    int maxCoins(vector<int>&A,int n)
    {
	    //Write your code here
	    
	    memset(t,-1,sizeof(t));
	    int start=0;
        return solve(A,0,n-1);

    }
};
