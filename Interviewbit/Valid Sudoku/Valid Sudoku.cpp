int Solution::isValidSudoku(const vector<string> &A) {
    vector<unordered_set<int>> row(9);
    vector<unordered_set<int>> col(9);
    vector<unordered_set<int>> box(9);
   
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
       
            if(A[i][j] != '.'){
                char curr = A[i][j];
               
                if(row[i].find(curr) != row[i].end())
                return 0;
                else row[i].insert(curr);
               
               
                if(col[j].find(curr) != col[j].end())
                return 0;
                else col[j].insert(curr);
             
                int index = i - i%3 + j/3;
                if(box[index].find(curr) != box[index].end())
                return 0;
                else box[index].insert(curr);
               
            }
        }
    }
   
    return 1;
}
