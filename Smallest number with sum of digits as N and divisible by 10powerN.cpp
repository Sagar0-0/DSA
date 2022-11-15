#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
	public:
	string digitsNum(int N)
	{
	    // Code here.
	    
	    int n = N;
	    
	    string ans ="";
	    
	    int i=9;
	    while(i>=1){
	        
	        if(n>=i){
	            ans = to_string(i)+ans;
	            n -= i;
	        }else{
	            i--;
	        }
	        
	        if(n==0){
	            break;
	        }
	    }
	    
	    
	    for(int i=1;i<=N;i++){
	        ans += '0';
	    }
	    return ans;
	}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		Solution ob;
		string ans = ob.digitsNum(n);
		cout << ans <<"\n";
	}
	return 0;
}
