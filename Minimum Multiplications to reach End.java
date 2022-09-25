//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int minimumMultiplications(vector<int>& arr, int start, int end) {
        // code here
       vector<int>ans(100001,-1);
       const int mod = 100000;

       queue<int> q;

       q.push(start % mod);
       ans[start] = 0;

       while (!q.empty()) {

           int top = q.front();

           q.pop();

           if (top == end) return ans[end];

           for (int i = 0; i < arr.size(); i++) {
               int pushed = top * arr[i];
               pushed = pushed % mod;

               if (ans[pushed] == -1) {
                   ans[pushed] = ans[top] + 1;
                   q.push(pushed);
               }
           }
       }
    }
};


//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        int start, end;
        cin >> start >> end;
        Solution obj;
        cout << obj.minimumMultiplications(arr, start, end) << endl;
    }
}

// } Driver Code Ends
