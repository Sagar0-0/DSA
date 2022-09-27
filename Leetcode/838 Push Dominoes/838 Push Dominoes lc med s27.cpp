#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
// using 2-pointer
    string pushDominoes(string dominoes) {
        int l = 0, n = dominoes.size();
        for (int r = 0; r < n; r++) {
            if (dominoes[r] == '.') {
                continue;
            } else if ((dominoes[r] == dominoes[l]) || (dominoes[l] == '.' && dominoes[r] == 'L')) {
                for (int k = l; k < r; k++) dominoes[k] = dominoes[r];
            } else if (dominoes[l] == 'L' && dominoes[r] == 'R') {

            }  else if (dominoes[l] == 'R' && dominoes[r] == 'L') {

                int m = (r - l - 1) / 2;
                for (int k = 1; k <= m; k++) dominoes[r - k] = 'L', dominoes[l + k] = 'R';
            }
            l = r;
            dominoes[l] = dominoes[r];
        }
        if (dominoes[l] == 'R') for (int k = l; k < n; k++) dominoes[k] = 'R';
        return dominoes;
    }
};