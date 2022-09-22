//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
    public:
     vector<int> max_of_subarrays(vector<int> a, int n, int k) {
        vector<int>ans;
        deque<int>q;
        int i=0, j=0;
        
        while(j<a.size())
        {
            while(q.size() && q.back()<a[j])
                q.pop_back();
                
            q.push_back(a[j]);
            
            if(j-i+1<k)
                j++;
            else{
                ans.push_back(q.front());
                if(q.front()==a[i])
                q.pop_front();
                i++; 
                j++;
            }
        }
        return ans;
    }
};


//{ Driver Code Starts.

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
// } Driver Code Ends
