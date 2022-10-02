    vector<long long> nextLargerElement(vector<long long> arr, int n){
        vector<long long>ans(n);
        stack<long long>s;
        
        for(int i=n-1;i>=0;i--)
        {
            while(!s.empty() && arr[i] >= s.top())
            {
                s.pop();
            }
            ans[i] = (s.empty())?-1:s.top();
            s.push(arr[i]);
        }
        return ans;
    }
