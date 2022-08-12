include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    //Function to perform case-specific sorting of strings.
    string caseSort(string str, int n)
    {
       
        vector<int>small;
        vector<int>cap;
        
        for(int i=0;i<n;i++){
            if(str[i]>=65&&str[i]<92){
                cap.push_back(i);
            }
            else{
                small.push_back(i);
            }
        }
        
        sort(str.begin(),str.end());
        
        int s=0,c=0;
     
        char ans[n+1];
        for(int i=0;i<n;i++){
            if(str[i]>=65&&str[i]<92){
             ans[cap[c]]=str[i];  
             c++;
            }
            else{
                ans[small[s]]=str[i];
                s++;
            }
            
        }
        ans[n]='\0';
        
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
		int n;
		cin>>n;
		string str;
		cin>>str;
		Solution obj;
		cout<<obj.caseSort (str, n)<<endl;
	}
}
// } Driver Code Ends
