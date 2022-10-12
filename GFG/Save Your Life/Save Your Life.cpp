class Solution{
public:
      string maxSum(string w,char x[], int b[],int n){
          // code here 
          
            int len = w.length();

          vector<int> nums(len);

          map<char, int> m;

          for (int i = 0; i < n; i++) {

              m[x[i]] = b[i];

          }

          for (int i = 0; i < len; i++) {

              if (m.find(w[i]) == m.end()) {

                  nums[i] = int(w[i]);

              }

              else {

                  nums[i] = m[w[i]];

              }

          }

          int sum = 0, max = INT_MIN;

          string ans = "", res;

          for (int i = 0; i < len; i++) {

              sum += nums[i];

              ans += w[i];

              if (sum > max) {

                  res = ans;

                  max = sum;

              }

              if (sum < 0) {

                  sum = 0;

                  ans = "";

              }

          }

          return res;
      }
};
