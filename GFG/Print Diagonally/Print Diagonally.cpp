class Solution{
	
	public:
	vector<int> downwardDigonal(int N, vector<vector<int>> A)
	{
		// Your code goes here
		vector<int>v;
		for(int i=0;i<N;i++){
		    for(int j=0;j<N&&j<=i;j++){
		          v.push_back(A[j][i-j]);
		    }
		}
		int s=1;
		for(int i=N;i<=2*(N-1);i++){
		    for(int j=s;j<N;j++){
		          v.push_back(A[j][i-j]);
		    }
		    s++;
		}
		return v;

	}

};
