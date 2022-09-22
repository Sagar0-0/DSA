class Solution {
  public:
    vector<int> max_of_subarrays(vector<int> arr, int n, int k) {
        // your code here
        vector<int>ans;
        multiset<int>s;
        for(int i = 0; i< k; i++)s.insert(arr[i]);
        auto it = s.end();
        it--;
        ans.push_back(*it);
        for(int i = k; i<n; i++){
            s.erase(s.find(arr[i-k]));
            s.insert(arr[i]);
            it= s.end();
            it--;
            ans.push_back(*it);

        }
        return ans;
    }
};
