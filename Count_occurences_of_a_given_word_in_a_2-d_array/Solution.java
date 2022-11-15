class Solution
{
    // write your code here
    int result = 0;
    boolean isSafe(char mat[][],int r,int c)
    {
        int rLen = mat.length,cLen = mat[0].length;
        if((r >= 0 && r < rLen)&&(c >= 0 && c < cLen))
        return true;
        return false;
    }
    public void dfs(char mat[][],int i,int r, int c,String target)
    {
        if(!isSafe(mat,r,c)) return;
        if(i == target.length()) return;
        char ch = target.charAt(i);
        if(ch != mat[r][c]) return;
 
        if(i == target.length()-1)
        {
            result+=1;
            return;
        }
        mat[r][c] = '$';
         
        dfs(mat,i+1,r+1,c,target);
        dfs(mat,i+1,r-1,c,target);
        dfs(mat,i+1,r,c+1,target);
        dfs(mat,i+1,r,c-1,target);
        
        mat[r][c] = ch;
        
    }
    public int findOccurrence(char mat[][], String target)
    {
        for(int i = 0;i < mat.length;i++)
            for(int j = 0; j < mat[i].length;j++)
                if(mat[i][j] == target.charAt(0))
                     dfs(mat,0,i,j,target);
        return result;
    }
}