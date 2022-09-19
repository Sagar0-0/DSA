vector<int> leftSmaller(int n, int a[]){
        // code here
        stack<int>st;
        vector<int>ans;
        for(int i=0;i<n;i++){
            while(st.size()!=0 && st.top()>=a[i]){
                st.pop();
            }
            int k=st.size()==0?-1:st.top();
            st.push(a[i]);
            ans.push_back(k);
        }
        return ans;
    }