// User function Template for C++

class Solution{
public:
    vector<int> leftSmaller(int n, int a[]){
        // code here
        
        vector<int> ans(n);
        stack<int> s;
        s.push(-1);
        
        
        for(int i=0;i<n;i++){
            
            if(s.top() < a[i]){
                ans[i] = s.top();
            }else{
                
                while(s.top()>=a[i]){
                    s.pop();
                }
                ans[i] = s.top();
                
            }
            s.push(a[i]);
            
            
        }
        
        return ans;
    }
};
