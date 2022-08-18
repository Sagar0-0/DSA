int minSetSize(vector<int>& arr) {
        map<int,int>mp;
        
        for(int i=0;i<arr.size();i++)
        {
            mp[arr[i]]++;
        }
        
        priority_queue<pair<int,int>>pq;
        
        for(auto it:mp)
        {
            pq.push({it.second,it.first});
        }
        
        int size=arr.size()/2;
        int count=0;
        
        while(size>0 && !pq.empty())
        {
            if(size<pq.top().first)
            {
                size-=pq.top().first;
                    count++;
                break;
            }
            else
            {
               size-=pq.top().first;
                count++;
                pq.pop();
            }
        }
        return count;
    }
