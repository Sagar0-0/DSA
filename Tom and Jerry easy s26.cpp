#include <bits/stdc++.h>
using namespace std;
class Solution {
  public:
    int numsGame(int N) {
        // code here
        // as per example tom wins in every even number, 
        if(N%2==0) return 1;
        else return 0;
    }
};
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;

        Solution ob;
        cout << ob.numsGame(N) << endl;
    }
    return 0;
}