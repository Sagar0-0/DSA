/*
  Approach: Since we have to find the maximum Island Area, so for if have any square Island we would consider it's adjacent(Top, Bottom, Left, Right), if they have 
   value 1(which will mean it's land), similarily we would check thier adjacent square positions, so on...., now we could observe here that once a land position is
   picked then we have to continue searching for land positon in all 4 directions of square, after that only total Island area could be found, then we move to another
   position which is land and also not part of any previous calculated(Traversed) Islands,
   
 By Observing above it is quite clear that we need to apply, DFS algorithm.

*/


// Code Below : 

class Solution {
public:
int travelMap(int r, int c, vector<vector<int>> &grid){
    if(r<0 || c<0 || r>=grid.size() || c>=grid[0].size() || grid[r][c]==0){
        return 0;
    }
    
  // So as to make it marked as visited position.
    grid[r][c] = 0;
    
    // int Down = travelMap(r+1, c, grid);
    // int Right = travelMap(r, c+1, grid);
    // int Up = travelMap(r-1, c, grid);
    // int Left = travelMap(r, c-1, grid);
  
  
  // 1 extra area added for the Area of Current position  
    return 1 + travelMap(r+1, c, grid) + travelMap(r, c+1, grid) + 
        travelMap(r-1, c, grid) + travelMap(r, c-1, grid);
}    
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int mxArea = 0;
        
        for(int i=0;i<grid.size(); i++){
            for(int j=0; j<grid[0].size(); j++){
                if(grid[i][j]==1){
                    mxArea = max(mxArea, travelMap(i,j, grid));
                }
            }
        }
        
        return mxArea;
    }
};

/*
  Time Complexity : O(mn)
  Space Complexity : O(1)
*/
