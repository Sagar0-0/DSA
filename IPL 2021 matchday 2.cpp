public:
    vector<int> max_of_subarrays(vector<int> arr, int n, int k) {
        deque<int> dq;
        vector<int> ans;
        
        for(int i=0; i<k; i++){
            if(dq.empty() || arr[dq.back()] > arr[i]) dq.push_back(i);
            else{
                while(!dq.empty() && arr[dq.back()] < arr[i]){
                    dq.pop_back();
                }
                dq.push_back(i);
            }
        }
        
        ans.push_back(arr[dq.front()]);
        
        for(int i=k; i<n; i++){
            
            if(i-dq.front()>=k)
                dq.pop_front();
            
            if(dq.empty() || arr[dq.back()] > arr[i]) dq.push_back(i);
            else{
                while(!dq.empty() && arr[dq.back()] < arr[i]){
                    dq.pop_back();
                }
                dq.push_back(i);
            }
            ans.push_back(arr[dq.front()]);
        }
        
        return ans;
    }
