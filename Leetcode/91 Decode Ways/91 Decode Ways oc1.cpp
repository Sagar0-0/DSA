#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int numDecodings(string s) {
//         check for empty string or leading zero
        if(!s.size() || s.front() == '0') return 0;
        int d1=1, d2 =1;   
        for(int i =1; i<s.size(); i++){
            if(s[i] == '0') d1 =0;
            if(s[i-1] == '1' || s[i-1] == '2' && s[i] <= '6'){
                d1= d2 + d1;
                d2 = d1-d2;
            }else
                d2 = d1;
        }
        return d1;
    }
};