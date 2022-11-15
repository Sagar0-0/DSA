import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}

class Solution
{
    static boolean isValid(int grid[][],int i, int j, int k){
        for(int row = 0;row<9;row++){
            if(grid[row][j]==k) return false;
        }
        for(int col = 0;col<9;col++){
            if(grid[i][col]==k) return false;
        }
        int col = (j/3)*3;
        int row = (i/3)*3;
        for(int l = 0;l<3;l++){
            for(int m = 0;m<3;m++){
                if(grid[row+l][col+m]==k) return false;
            }
        }
        return true;
    }
    static boolean solve(int grid[][],int i,int j){
        int ni = 0,nj = 0;
        if(i==9){
            return true;
        }
        if(j==8){
            ni=i+1;
            nj=0;
        }else{
            ni = i;
            nj = j+1;
        }
        if(grid[i][j]!=0) return solve(grid,ni,nj);
        
        for(int k = 1;k<=9;k++){
            if(isValid(grid,i,j,k)){
                grid[i][j] = k;
                if(solve(grid,ni,nj)){
                    return true;
                }
                grid[i][j] = 0;
            }
        }
        
       return false;
    }
    static boolean SolveSudoku(int grid[][]){return solve(grid,0,0);}

    static void printGrid (int grid[][])
    {
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){ System.out.print(grid[i][j]+" ");} 
        }
    }
}