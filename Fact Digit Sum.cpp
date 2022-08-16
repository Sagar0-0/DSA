class Solution{
	public:
	vector<int> FactDigit(int N)
	{
	    // Code here
	    vector<int> fact(10,1);
	    
	    for(int i=1; i<10; i++)
	    fact[i] = (fact[i-1]*i);
	    
	    vector<int> ans;
	    
	    int f = 9;
	    
	    while(N)
	    {
	        if(fact[f] <= N)
	        {
	            N -= fact[f];
	            ans.push_back(f);
	        }
	        else
	        f--;
	    }
	    
	    sort(ans.begin(), ans.end());
	   
	    return ans;
	}
};
