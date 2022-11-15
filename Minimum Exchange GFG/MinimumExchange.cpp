class Solution {
public:
int MinimumExchange(vector<vector<char>>matrix){
    // Code here
    int ans1=0;
    int ans2=0;
    for(int i=0;i<matrix.size();i++){
        for(int j=0;j<matrix[0].size();j++){
            
             if((i+j)%2==1 && matrix[i][j]=='A'){
                ans1++;
            }
            if((i+j)%2==0 && matrix[i][j]=='B'){
                ans1++;
            }
           
        }
    }
    
      for(int i=0;i<matrix.size();i++){
        for(int j=0;j<matrix[0].size();j++){
            if((i+j)%2==0 && matrix[i][j]=='A'){
                ans2++;
            }
            if((i+j)%2==1 && matrix[i][j]=='B'){
                ans2++;
            }
        }
    }
    return min(ans1,ans2);
}

};

//  More concise code
 
//  int MinimumExchange(vector<vector<char>>matrix){
//     // Code here
//     int m = matrix.size(), n = matrix[0].size();
//     int cnt = 0;
    
//     for(int i=0; i<m; i++)
//     {
//         for(int j=0; j<n; j++)
//         {
//             if((i+j)%2 == 0 and matrix[i][j] == 'B')
//             cnt++;
            
//             if((i+j)%2 and matrix[i][j] == 'A')
//             cnt++;
//         }
//     }
    
//     return min(cnt, m*n - cnt);
// }
