#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    vector<int> max_of_subarrays(vector<int> arr, int n, int k) {
        // your code here
        vector<int>res;
        multiset<int>m;

        for(int i =0; i<k; i++) m.insert(arr[i]);
        res.push_back(*(--m.end()));
        for(int i =k;i<n; i++){
            m.erase(m.lower_bound(arr[i-k]));
            m.insert(arr[i]);
            res.push_back(*(--m.end()));
        }
        return res;
       
    }
};

int main() {

    int t;
    cin >> t;

    while (t--) {

        int n, k;
        cin >> n >> k;

        vector<int> arr(n);
        for (int i = 0; i < n; i++) cin >> arr[i];
        Solution ob;
        vector<int> res = ob.max_of_subarrays(arr, n, k);
        for (int i = 0; i < res.size(); i++) cout << res[i] << " ";
        cout << endl;
    }

    return 0;
}
