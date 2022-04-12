class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==1)ans[i][j]=1;
                int ones=getNebs(board,i,j);
                if(ones<2 && board[i][j]==1){
                    ans[i][j]=0;
                }else if((ones==2 || ones==3) && board[i][j]==1){
                    ans[i][j]=1;
                }else if(board[i][j]==1 && ones>3){
                    ans[i][j]=0;
                }else if(board[i][j]==0 && ones==3){
                    ans[i][j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=ans[i][j];
            }
        }
    }
    public int getNebs(int[][]mat,int i,int j){
        int ans=0;
        int n=mat.length;
        int m=mat[0].length;
        if(i>0){
            ans+=mat[i-1][j];
        }
        if(j>0){
            ans+=mat[i][j-1];
        }
        if(i>0 && j>0){
            ans+=mat[i-1][j-1];
        }
        if(j<m-1){
            ans+=mat[i][j+1];
        }
        if(i>0 && j<m-1){
            ans+=mat[i-1][j+1];
        }
        if(i<n-1){
            ans+=mat[i+1][j];
        }
        if(j>0 && i<n-1){
            ans+=mat[i+1][j-1];
        }
        if(j<m-1 && i<n-1){
            ans+=mat[i+1][j+1];
        }
        return ans;
    }
}