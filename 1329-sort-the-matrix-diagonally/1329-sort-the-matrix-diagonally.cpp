class Solution {
public:
    vector<vector<int>> diagonalSort(vector<vector<int>>& mat) { 

// // Explanation
// // A[i][j] on the same diagonal have same value of i - j
// // For each diagonal,
// // put its elements together, sort, and set them back.


// // Complexity
// // Time O(MNlogD), where D is the length of diagonal with D = min(M,N).
// // Space O(MN)

        // solving with priority queue, 20ms
//         int n = mat.size(), m = mat[0].size();
//         unordered_map<int, priority_queue<int, vector<int>, greater<int>>> mp;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 mp[i-j].push(mat[i][j]);
//             }
//         }   
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 mat[i][j] = mp[i-j].top();
//                 mp[i-j].pop();
//             }
//         }
//         return mat;



        // 2. solving with sorting techniques, 8ms 
        int r = mat.size(), c = mat[0].size();
        int j,p,q;
        // solving upper right triangle
        for(int i=0;i<c;i++){
            // extracting the values 
            p=0,q=i;
            vector<int> t;
            while(p < r and q < c){
                t.push_back(mat[p][q]);
                p++;q++;
            }
            sort(t.begin(), t.end());
            // placing back
            p=0,q=i,j=0;
            while(p<r and q<c){
                mat[p][q] = t[j];
                p++;q++;j++;
            }
        }

        // solving lower left triangle
        for(int i=1;i<r;i++){
            // extracting the values
            vector<int> t;
            p=i,q=0;
            while(p<r and q<c){
                t.push_back(mat[p][q]);
                p++;q++;
            }
            sort(t.begin(),t.end());
            // placing back
            p=i,q=0,j=0;
            while(p<r and q<c){
                mat[p][q] = t[j];
                p++;q++;j++;
            }
        }
        return mat;
    }
};
