class Solution {
  public:
    string findSum(string X, string Y) {
        // Your code goes here
        string ans = "";
        
        int n = X.length()-1, m = Y.length()-1, rem = 0;
        
        while(n >= 0 and m >= 0)
        {
            int cur = (X[n--]-'0') + (Y[m--]-'0') + rem;
            rem = cur/10;
            cur = cur%10;
            
            ans.push_back('0'+cur);
        }
        
        while(n >= 0)
        {
            int cur = (X[n--]-'0') + rem;
            rem = cur/10;
            cur = cur%10;
            
            ans.push_back('0'+cur);
        }
        
        while(m >= 0)
        {
            int cur = (Y[m--]-'0') + rem;
            rem = cur/10;
            cur = cur%10;
            
            ans.push_back('0'+cur);
        }
        
        if(rem)
        ans.push_back('0'+rem);
        
        while(ans.back() == '0')
        ans.pop_back();
        
        if(ans.empty())
        return "0";
        
        reverse(ans.begin(), ans.end());
        
        return ans;
    }
};

// Used almost same approach
// class Solution {
//   public:
//     string findSum(string X, string Y) {
        
//         int i = X.length()-1, j = Y.length()-1;
        
//         string ans = "";
//         int c = 0;
//         while(i >= 0 || j >= 0 || c != 0){
//             int val1 = 0, val2 = 0;
//             if(i >= 0) val1 = X[i] - 48;
//             if(j >= 0) val2 = Y[j] - 48;
//             int sum = val1+val2+c;
            
//             int rem = sum % 10;
//             ans.push_back(char(rem+48));
//             c = sum / 10;
//             if(i>=0) i--;
//             if(j>=0) j--;
//         }
//         reverse(ans.begin(), ans.end());
        
//         int idx = 0;
//         while(idx < ans.size()-1){
//             if(ans[idx] != '0')
//                 break;
//             idx++;
//         }
//         ans.erase(0,idx);
//         return ans;
//     }
// };
