class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
         int row=heights.length;
        int col=heights[0].length;
        List<List<Integer>> ans=new ArrayList<>();
        
        if(heights==null || row==0 && col==0){
            return ans;
        }
        
    
        
        /**
        Solution :
        
        1. check for the pacific ocean(Run DFS for it)
        2. check for the atalantic ocean(Run DFS for it)
        3. check for both same occdinates
        4. Return ans;
        
        TC=(n^2)
        SC=(n^2)
        */
        
      
        
        boolean[][] pacific=new boolean[row][col];
        boolean[][] atalantic=new boolean[row][col];
        
        //pacific
        for(int j=0;j<col;j++){
            
            int prevVal=Integer.MIN_VALUE;
            
            //i=0
            dfs(0,j,pacific,heights,prevVal);
            dfs(row-1,j,atalantic,heights,prevVal);
        }

         //atalantic
        for(int i=0;i<row;i++){
            
            int prevVal=Integer.MIN_VALUE;
            
            //j=0
            dfs(i,0,pacific,heights,prevVal);
            dfs(i,col-1,atalantic,heights,prevVal);
        }
        
        
        //check common
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(pacific[i][j] && atalantic[i][j]){
                    List<Integer> inner=new ArrayList<>();
                    inner.add(i);
                    inner.add(j);
                    ans.add(inner);
                }
            }
        }
        
        return ans;
        
    }
    
    public void dfs(int i,int j,boolean[][] isPossible, int[][] heights,int prevVal){
        
        if(i<0 || j<0 || i>=heights.length || j>=heights[0].length || isPossible[i][j] || prevVal>heights[i][j])
            return;
        
        isPossible[i][j]=true;
        
        //now make dfs in all 4 direction
        dfs(i-1,j,isPossible,heights,heights[i][j]);
        dfs(i,j+1,isPossible,heights,heights[i][j]);
        dfs(i+1,j,isPossible,heights,heights[i][j]);
        dfs(i,j-1,isPossible,heights,heights[i][j]);
        
    }
}