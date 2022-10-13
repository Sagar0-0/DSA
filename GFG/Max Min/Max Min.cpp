class Solution
{
   public:
    int findSum(int A[], int N)
    {
    	//code here.
    	
    	int maxVal=INT_MIN;
    	int minVal=INT_MAX;
    	for(int i=0;i<N;i++){
    	    maxVal=max(maxVal,A[i]);
    	    minVal=min(minVal,A[i]);
    	}
    	return maxVal+minVal;
    }

};
