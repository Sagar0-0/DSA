#include <bits/stdc++.h>
using namespace std ; 

class Solution {
public:
    int maxSum(vector<vector<int>>& grid) {
        int m = grid.size() ; 
        // Gives the no. of rows in a matrix. 
        int n = grid[0].size() ; 
        // Gives the no. of columns in a matrix. 

        int sum = 0 ; 
        // Initialised a variable for calculating the sum. 
        int maxi = 0 ; 
        // Initialized a variable for comparing and finding the maximum sum. 
        for(int i = 1 ; i < m - 1 ; i++) 
        {
            for(int j = 1 ; j < n - 1 ; j++)
            {
                // Carefully, Access all the grid indices in the form of hour glass by sticking to one point. 
                // Avoid accessing the wrong indices and indices out of bound. 
                sum += grid[i][j] + grid[i + 1][j] + grid[i + 1][j  - 1] + grid[i + 1][j + 1] + grid[i - 1][j] + grid[i - 1][j + 1] + grid[i - 1][j - 1] ; 
                maxi = max(sum , maxi) ; 
                // Used the inbuilt max function of C++ to comapare the previous and curreent values. 

                sum = 0 ; 
                // Again, initialised the sum to be zero so that for next iteration it will again start from zero. 

            }

        }
        return maxi ; 
        // Return the maximum sum after completing all the iterations. 
// Generalised, Time Complexity of the solution is - O(N^2) -  As the nested loop is involved. 
    }
};
