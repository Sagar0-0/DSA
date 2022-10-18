// Easy approach by using adjacency list and using a simple understanding as sum of i+j in vector array A can be helpful for finding answer.



class Solution{

	

	public:

	vector<int> downwardDigonal(int N, vector<vector<int>> A)

	{

		// Your code goes here

		int n = N-1+N;

		vector<int> arr[n];

		vector<int> ans;

		for(int i=0; i<N; i++){

		    for(int j=0; j<N; j++){

		        arr[i+j].push_back(A[i][j]);

		    }

		}

		for(int i=0; i<n; i++){

		    for(auto it: arr[i]){

		        ans.push_back(it);

		    }

		}

		return ans;

	}



};
