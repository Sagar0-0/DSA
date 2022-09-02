class Solution {
public:
    int minimumCostOfBreaking(vector<int> X, vector<int> Y, int M, int N){
        //Write your code here
    
        int ans = 0;
        
        sort(X.begin(), X.end(), greater<int>());
        sort(Y.begin(), Y.end(), greater<int>());
        
        int i=0, j=0;
        
        while(i<M-1 and j<N-1)
        {
            if(X[i] >= Y[j])
            ans += (j+1)*X[i++];
            else
            ans += (i+1)*Y[j++];
        }
        
        while(i<M-1)
        ans += (j+1)*X[i++];
        
        while(j<N-1)
        ans += (i+1)*Y[j++];
        
        return ans;
    }
};
