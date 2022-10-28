class Solution {
	public:
		int NthTerm(int n){
		    // Code  here
		    
		    long mod = 1000000007;
		    
		    long ans = 1;
		    
		    for(int i=1; i<=n; i++){
		        
		        ans = (ans*i)% mod + 1;
		        
		    }
		    
		    
		    return ans;
		}

};
