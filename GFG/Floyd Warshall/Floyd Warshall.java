class Solution
{
    public void shortest_distance(int[][] mat)
    {
        // Code here 
        int n=mat.length;
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][k]==-1 || mat[k][j]==-1)continue;
                    if(mat[i][j]==-1 || mat[i][k]+mat[k][j]<mat[i][j]){
                        mat[i][j]=mat[i][k]+mat[k][j];
                    }
                }
            }
        }
    }
}
