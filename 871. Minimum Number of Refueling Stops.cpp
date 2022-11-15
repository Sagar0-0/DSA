 int minRefuelStops(int target, int sf, vector<vector<int>>& s) {
        priority_queue<int>pq;
        int i=0,res;
        
        for(res=0;sf<target;res++)
        {
            while(i<s.size() && s[i][0]<=sf)
            {
                pq.push(s[i++][1]);
            }
                if(pq.empty())return -1;
                
                sf+=pq.top();
                pq.pop();
            
        }
        return res;
    }
