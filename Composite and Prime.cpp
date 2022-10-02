//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
	public:
		int Count(int L, int R){
		    // Code here
		//using the Sieve of Eratosthenes
    
		vector<bool>v(R+1, true);       //initially considering all number as prime
		
		
		for(int i=2; i*i<=R; i++){
		    for(int j=i*i; j<=R; j+=i){
		        v[j] = false;           //marking all composite numbers as false
		    }
		}
		
		int composite=0, prime=0;
		
		for(int i=L; i<=R; i++){
		    if(i==1)                    //since 1 is neither prime nor composite
		        continue;
		    else if(v[i]==true)
		        prime++;
		    else
		        composite++;
		}
		return composite-prime;
	}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int L, R;
		cin >> L >> R;
		Solution obj;
		int ans = obj.Count(L, R);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends
