class Solution{
  public:
    vector<int> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        //Your code goes here
        vector<int> ans;
        
        sort(arr2, arr2+n);
        
        for(int i=0; i<m; i++)
        {
            int cnt = upper_bound(arr2, arr2+n, arr1[i]) - arr2;
            
            ans.push_back(cnt);
        }
        
        return ans;
    }
};
