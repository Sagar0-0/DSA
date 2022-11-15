#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
int MinimumExchange(vector<vector<char>>matrix){
    // Code here
    int m = matrix.size(), n = matrix[0].size();
    int case1=0, case2 = 0;
    for(int i =0; i<m; i++){
        for(int j =0; j<n; j++){
            if(i%2==0 && j%2==0){
                if(matrix[i][j] != 'A') case1++;
                else case2++;
            }
            if(i%2==0 && j%2==1){
                if(matrix[i][j]!= 'B')case1++;
                else case2++;
            }
            if(i%2==1 && j%2==0){
                if(matrix[i][j]!= 'B') case1++;
                else case2++;
            }
            if(i%2==1 && j%2==1){
                if(matrix[i][j]!= 'A') case1++;
                else case2++;
            }
        }
    }
    return min(case1, case2);
    /*TC : O(m*n)

SC : O(1)
*/
}

};
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<char>>matrix(n, vector<char>(m,'x'));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++)
				cin >> matrix[i][j];
		}
		Solution obj;
		int ans = obj.MinimumExchange(matrix);
		cout << ans <<"\n";
	}
	return 0;
}