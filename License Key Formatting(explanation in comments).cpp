//{ Driver Code Starts
/* Driver program to test above function */

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//Back-end complete function Template for C++
class Solution
{
   public:
    string ReFormatString(string S, int K){
    	
    	int n = S.size();
    	string ans, temp;
    	
    	/*we start fro the end of the string , 
    	because only the first group can have contain characters less than K*/
    	for(int i=n-1;i>=0;i--){           
    	    char ch = S[i];
    	    
    	    //if we encounter a dash, ignore and continue
    	    if(ch=='-')
    	        continue;
    	    else{
    	        
    	        //change to uppercase
    	        temp+=toupper(ch);
    	        
    	        //check temp size
    	        if(temp.size() == K){
    	            
    	            //add temp to ans
    	            ans+=temp;      
    	            
    	            //add dash b/w them
    	            ans+='-';
    	            
    	            //empty the temp to search for next K elements
    	            temp="";
    	        }
    	    }
    	}
    	
    	/*Adding the leftover elements(Since the size of temp never reached K, 
    	temp won't enter the if case nested inside the else ABOVE)*/
    	ans+=temp;
    	
    	//Since we stored the elements in temp in reverse order, we'll reverse
    	reverse(ans.begin(), ans.end());
    	
    	//Incase the first element is a dash, we would remove it
    	if(ans[0] == '-')
    	    ans.erase(ans.begin());
    	    
    	return ans;
    }
};

//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    string S;
	    cin>>S;
	    int K;
	    cin >> K;
	    Solution ob;  
	    string ans=ob.ReFormatString(S, K);
	    cout<<ans;
	    cout<<"\n";
	}
	return 0;
}

// } Driver Code Ends
