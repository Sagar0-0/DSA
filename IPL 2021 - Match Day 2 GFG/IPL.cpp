vector<int> max_of_subarrays(vector<int> arr, int n, int k) {
        
        deque<int>pq;
        vector<int>ans;
        
        for(int i=0;i<n;i++)
       {
            if(!pq.empty() && pq.front()==i-k){ 
                pq.pop_front();
            }
             while(!pq.empty() && arr[pq.back()]<=arr[i]){ 
                        pq.pop_back();
             }
          pq.push_back(i);
            if(i>=k-1){ 
            ans.push_back(arr[pq.front()]);
            }
        }
        
        return ans;
    }