//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
      vector<int> subarraySum(int arr[], int n, long long s)
    {
        vector<int> ans;
        if(s==0)
        {
            ans.push_back(-1);
            return ans;
        }
        int start=0;
        int end=0;
        long long sum=0;
        while(end<n &&sum<s)
        {
            sum=sum+arr[end];
            if(sum<s)
            end++;
        }
        if(end==n)
        {
            ans.push_back(-1);
            return ans;
        }
        if(sum==s)
        {
            ans.push_back(start+1);
            ans.push_back(end+1);
            return ans;
        }
        end++;
        while(end<n)
        {
            while(sum>s)
            {
                sum=sum-arr[start];
                start++;
                                if(sum==s)
                               {
                                   ans.push_back(start+1);
                                   ans.push_back(end);
                                  return ans;
                                }

            }
            while(end<n&&sum<s)
            {
                sum=sum+arr[end];
                if(sum==s)
                {
                                ans.push_back(start+1);
                                ans.push_back(end+1);
                                return ans;
                }
                end++;
            }
        }
        while(start<n&&sum>s)
        {
                            sum=sum-arr[start];
                            start++;
                                if(sum==s)
                               {
                                   ans.push_back(start+1);
                                   ans.push_back(end);
                                  return ans;
                                }

        }
        ans.push_back(-1);
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
        long long s;
        cin>>n>>s;
        int arr[n];
        const int mx = 1e9;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        Solution ob;
        vector<int>res;
        res = ob.subarraySum(arr, n, s);
        
        for(int i = 0;i<res.size();i++)
            cout<<res[i]<<" ";
        cout<<endl;
        
    }
	return 0;
}
// } Driver Code Ends