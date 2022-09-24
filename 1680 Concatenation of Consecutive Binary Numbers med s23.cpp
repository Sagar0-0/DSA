#include<bits/stdc++.h>
using namespace std;;

class Solution {
public:
    // using bit manipulation TC: O(N), SC: O(1)
    int concatenatedBinary(int n) {
       int m = 1e9+7, l=0; // l is bit length to be shifted
        long res =0;
        for(int i =1; i<=n; i++){
             if ((i & (i - 1)) == 0) l += 1;
            res = ((res << l) | i) % m;
        }
        return res;
        
    }
};