




class Solution {
  public:
  
// X for start
// O for out of bound or water
// L for left
// R for right
// U for up
// D for down
  
    string getPath(vector<vector<int>>& grid, int i, int j, int rows, int cols, string direction){
        
        if(i<0 ||j<0 || i>=rows || j>=cols || grid[i][j] == 0) return "O";
        
        grid[i][j] = 0;
        
        
        //find the total no of islands and return as string
        
        string up = getPath(grid, i-1, j, rows, cols, "U");
        string right = getPath(grid, i, j+1, rows, cols, "R");
        string bottom = getPath(grid, i+1, j, rows, cols, "B");
        string left = getPath(grid, i, j-1, rows, cols, "L");
        
        return direction + up + right + bottom + left;
        
    }
  
  
    int countDistinctIslands(vector<vector<int>>& grid) {
        // code here
        
        
    int rows = grid.size();
    if (rows == 0)
        return 0;
 
    int cols = grid[0].size();
    if (cols == 0)
        return 0;
        
    // for distinct island we are using set;    
   
    set<string> island;
    
    for(int i=0; i<rows; i++){
        
        for(int j=0; j<cols; j++){
            
            if(grid[i][j]== 1){
                
                string path = getPath(grid,i,j,rows,cols,"X");
                
                island.insert(path);
                
            }
            
        }
    }
    return island.size();
    }
};
