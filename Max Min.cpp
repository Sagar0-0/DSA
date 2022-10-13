class Solution
{
   public:
    int findSum(int A[], int N)
    {
    	int maxi = INT_MIN, mini = INT_MAX;
    	for(int i = 0; i < N; i++){
    	    maxi = max(maxi,A[i]);
    	    mini = min(mini,A[i]);
    	}
    	return maxi + mini;
    }

};
