#include <bits/stdc++.h>
using namespace std;

class Solution
{
    public:
    //Function to return the minimum cost of connecting the ropes.
    long long minCost(long long arr[], long long n) {
        // Your code here
        if(n==1) return 0; // base case if 1 rope is only given then we don't have to add so return 0
        
        priority_queue<long long, vector<long long>, greater<long long>> pq; // taking priority_queue in main_heap
        for(int i=0; i<n; i++) pq.push(arr[i]); // using loop pushing every elem into priority_queue
        long long res =0; // initializing res with 0
        
        long long x = pq.top(); 
        // running a loop if we get only 1 elems then come out of loop
        while(pq.size()>1){
            // getting 1st elem mini from top and popping out from priority_queue
            long long x = pq.top(); pq.pop();
            // getting 2nd elem mini from top and popping out from priority_queue
            long long y = pq.top(); pq.pop();
            // adding 1st mini and 2nd mini
            res+=(x+y);
            // pushing to Priority queue to add with other numbers also
            pq.push(x+y);
        }
        return res;
        // TC: O(N log N) -> pq takes log n and loop is running for n times so it becomes nlogn
        // SC: O(N) - pq is taking N Space to store
    }
};
int main() {
    long long t;
    cin >> t;
    while (t--) {
        long long n;
        cin >> n;
        long long i, a[n];
        for (i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        cout << ob.minCost(a, n) << endl;
    }
    return 0;
}