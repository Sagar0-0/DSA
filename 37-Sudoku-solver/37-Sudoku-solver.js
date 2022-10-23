var solveSudoku = function(board) {

    function isValid(grid, row, col, k) {
     for (let i = 0; i < 9; i++) {
         const m = 3 * Math.floor(row / 3) + Math.floor(i / 3);
         const n = 3 * Math.floor(col / 3) + i % 3;
         if (grid[row][i] == k || grid[i][col] == k || grid[m][n] == k) {
           return false;
         }
     }
     return true;
 }


 function solve(grid) {

   for (let i = 0; i < 9; i++) {
     for (let j = 0; j < 9; j++) {

       if (grid[i][j] == '.') {

         for (let k = 1; k <= 9; k++) {

           if (isValid(grid, i, j, k)) {
              grid[i][j] = `${k}`;
           if (solve(grid)) {
            return true;
           } else {
            grid[i][j] = '.';
           }
          }
        }

        return false;
      }
    }
  }

      return true;
  }
     solve(board)
     return board ;
 };