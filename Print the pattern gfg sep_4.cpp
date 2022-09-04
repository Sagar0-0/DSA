#include<bits/stdc++.h>
using namespace std;

class Solution{
    public:
        vector<string> pattern(int n){
        // code here
        vector<string> res;
        int cnt=1;
        for(int i=0;i<n;i++){
            string t="";
            for(int j=0;j<2*i;j++){
                t.push_back('-');
            }
            for(int j=1;j<=n-i;j++){
                t+=to_string(cnt++)+"*";
            }
            res.push_back(t);
        }
        
        for(int i=n-1;i>=0;i--){
            string t="";
            for(int j=n-1;j>=i;j--){
                t+= to_string(cnt++)+"*";
            }
            t.pop_back();
            res[i]+= t;
        }
        
        return res;
    }
};
