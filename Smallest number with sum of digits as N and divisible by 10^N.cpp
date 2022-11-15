class Solution{
	public:
	string digitsNum(int N)
	{
	    // Code here.
	    string ans = "";
	    int n = N;
	    
	    while(n >= 9)
	    {
	        n -= 9;
	        ans.push_back('9');
	    }
	    
	    if(n)
	        ans.push_back('0'+n);
	    
	    reverse(ans.begin(), ans.end());
	    
	    for(int i=0; i<N; i++)
	    ans.push_back('0');
	    
	    return ans;
	}
};
