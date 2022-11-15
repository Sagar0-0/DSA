#include<bits/stdc++.h>
using namespace std;

class Solution {
	public:
	vector<int>isprime;
	vector<int> count;
	void isPrime(int n){
	    bool prime[n+1];
	    count.resize(n+1,0);
	    memset(prime, true, sizeof(prime));
	    
	    for(int ip =2; ip*ip<=n; ip++){
	        if(prime[ip]== true){
	            for(int i=ip*2; i<=n; i+=ip) prime[i] = false;
	        }
	    }
	    int c =0;
	    for(int p=2; p<=n; p++){
	        c+=(prime[p]== true);
	        count[p] = c;
	    }
	}
		int Count(int L, int R){
		    // Code here
		    isPrime(R);
		    int ans = (R-L+1)-2*(count[R]-count[L-1]);
		  //  1 is neither prime or comp
		  if(L==1) ans--;
		  return ans;
		}

};

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