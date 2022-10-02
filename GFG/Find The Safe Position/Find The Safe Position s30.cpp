#include <bits/stdc++.h>
using namespace std;
class Solution {
  public:
    int safePos(int n, int k) {
        // code here
        if(n==1) return 1;
        int p = safePos(n-1, k);
        return (p+k-1)%n +1;
    }
};
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n,k;
        
        cin>>n>>k;

        Solution ob;
        cout << ob.safePos(n,k) << endl;
    }
    return 0;
}