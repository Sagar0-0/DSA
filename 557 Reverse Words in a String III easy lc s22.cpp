#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
//     2 -pointer tech TC: O(N) -outer loops iterate over N chars to find start & end idx of every word, reverse word also iterates N times to perform N/2 swaps. thus , TC is O(N+N) = O(N)
//     SC: O(1) using const extra space to track last space idx
    string reverseWords(string s) {
        int lastSpaceIndex = -1;
        int len = (int)s.size();
        for(int i = 0; i <= len; i++){
            if(i== len || s[i] == ' '){
                int start_i = lastSpaceIndex +1;
                int end_i = i-1;
                while(start_i < end_i){
                    char temp = s[start_i];
                    s[start_i] = s[end_i];
                    s[end_i] = temp;
                    start_i++;
                    end_i--;
                }
                lastSpaceIndex = i;
            }
        }
        return s;
        
    }
};