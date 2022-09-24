   priority_queue<int,vector<int>,greater<int>>r;
    priority_queue<int>l;
 //Function to insert heap.
    void insertHeap(int &x)
    {
        
            if( r.size()>0 && r.top()<x){
                r.push(x);
            }
        else
        l.push(x);
        balanceHeaps();
    }
    
    //Function to balance heaps.
    void balanceHeaps()
    {
        if(abs(l.size()-r.size())>1){
            if(l.size()>r.size()){
                int store=l.top();
                l.pop();
                r.push(store);
            }else{
               int store=r.top();
                r.pop();
                l.push(store); 
            }
        }
        
    }
    
    //Function to return Median.
    double getMedian()
    {
        if(l.size()-r.size()!=0){
            balanceHeaps();
            if(l.size()>r.size()){
                return l.top();
            }else{
                return r.top();
            }
        } else{
            int store1=l.top();
            int store2=r.top();
            return double((store1+store2)/2);
        }       
    }