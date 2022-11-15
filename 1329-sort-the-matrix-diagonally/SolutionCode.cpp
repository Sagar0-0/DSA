class Solution {
public:
    void sortIt(int r,int c,int m,int n,vector<vector<int>> &v){
        int i = r, j = c;
        vector<int> a;
        while(i<m && j<n){
            a.push_back(v[i][j]);
            i++, j++;
        }
        
        sort(a.begin(), a.end());
        i = r, j= c;
        int pos = 0;
        while(i<m && j<n){
            v[i][j] = a[pos++];
            i++, j++;
        }
    }
    vector<vector<int>> diagonalSort(vector<vector<int>>& mat) {
        if(mat.size()==1) return mat;
        
        int m = mat.size(), n = mat[0].size();
        
        //0 row
        for(int col = 0;col<n;col++){
            sortIt(0,col,m,n, mat);
        }
        
        //0 col
        for(int row = 1;row<m;row++){
            sortIt(row,0,m,n, mat);
        }
        
        return mat;
    }
};
