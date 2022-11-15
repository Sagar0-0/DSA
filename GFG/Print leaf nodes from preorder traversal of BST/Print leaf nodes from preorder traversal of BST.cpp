class Solution {
  public:
    vector<int> leafNodes(int a[],int n) {
        // code here
        
         stack<int> s;
        vector<int> vec;
        s.push(a[0]);
        for(int i=1;i<n;i++){
            if(s.top()<a[i]){
                int pc = 0;
                int ln = s.top();
                while(!s.empty()&&s.top()<a[i]){
                    s.pop();
                    pc++;
                }
                if(pc>1){
                    vec.push_back(ln);
                }
            }
            s.push(a[i]);
        }
        if(!s.empty()){
            vec.push_back(s.top());
        }
        return vec;
    }
};
