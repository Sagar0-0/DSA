class Solution {
  public:
    int sumOfAll(int l, int r){
        // code here
        
        vector<int> p(10005, 0);
        p[0] = p[1] = 1;
        for(int i = 2; i <= 10004; i++){
            if(p[i] == 0){
             for(int j = i; j <= 10004; j += i){
                 p[j] += i;
             }
            }
        }
        int ans = 0;
        for(int i = l; i <= r; i++){
            ans += p[i];   
        }
        return ans;
    }
};
