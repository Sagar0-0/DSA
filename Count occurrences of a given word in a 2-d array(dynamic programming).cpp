class Solution{
    public:
    void solve(int i, int j, vector<vector<char> > &mat, string target,int index, int &ans){
        int row=mat.size();
        int col=mat[0].size();
    if(i<0 or i>=row or j<0 or j>=col or index==target.length() or  mat[i][j]=='1' or target[index]!=mat[i][j])
            return;
    if(index==target.length()-1 && target[index]==mat[i][j])
         ans++;
    index++;
    char temp=mat[i][j];
    mat[i][j]='1';
        
         solve(i,j-1,mat,target,index,ans);
         solve(i,j+1,mat,target,index,ans);
         solve(i-1,j,mat,target,index,ans);
         solve(i+1,j,mat,target,index,ans);
    mat[i][j]=temp;
    }
    int findOccurrence(vector<vector<char> > &mat, string target){
        int row=mat.size();
        int col=mat[0].size();
        int ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                solve(i,j,mat,target,0,ans);
            }
        }
        return ans;
    }
};
