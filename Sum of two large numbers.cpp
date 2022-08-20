class Solution {
  public:
    string findSum(string X, string Y) {
        
        int i = X.length()-1, j = Y.length()-1;
        
        string ans = "";
        int c = 0;
        while(i >= 0 || j >= 0 || c != 0){
            int val1 = 0, val2 = 0;
            if(i >= 0) val1 = X[i] - 48;
            if(j >= 0) val2 = Y[j] - 48;
            int sum = val1+val2+c;
            
            int rem = sum % 10;
            ans.push_back(char(rem+48));
            c = sum / 10;
            if(i>=0) i--;
            if(j>=0) j--;
        }
        reverse(ans.begin(), ans.end());
        
        int idx = 0;
        while(idx < ans.size()-1){
            if(ans[idx] != '0')
                break;
            idx++;
        }
        ans.erase(0,idx);
        return ans;
    }
};
