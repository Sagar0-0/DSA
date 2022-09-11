class Solution
{
    int ans;
    public int findOccurrence(char mat[][], String target)
    {
        ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                dfs(mat,i,j,target,0);
            }
        }
        return ans;
    }
    void dfs(char[][]mat,int i,int j,String target,int idx){
        if(i<0 || j<0 || i==mat.length || j==mat[0].length || idx>=target.length()
        || target.charAt(idx)!=mat[i][j])return;
        if(idx==target.length()-1){
            ans++;
            return;
        }
        char ch=mat[i][j];
        mat[i][j]='0';
        dfs(mat,i+1,j,target,idx+1);
        dfs(mat,i-1,j,target,idx+1);
        dfs(mat,i,j+1,target,idx+1);
        dfs(mat,i,j-1,target,idx+1);
        mat[i][j]=ch;
    }
}
