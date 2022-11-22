class Solution {
  public:
 void shortest_distance(vector<vector<int>>&mat)
     int n = mat.size();
     for(int i = 0;i<n;i++)
     {
         for(int j = 0;j<n;j++)
         {
             for(int k = 0;k<n;k++)
             {
                 if(mat[j][k] == -1)
                 {
                     if(mat[j][i] != -1 && mat[i][k] != -1)
                     mat[j][k] = mat[j][i] + mat[i][k];
                 }
                 else 
                {
                     if(mat[j][i] != -1 && mat[i][k] != -1)
                     mat[j][k] = min(mat[j][k] , mat[j][i]+mat[i][k]);
                }              
             }
         }
     }
 }
};
