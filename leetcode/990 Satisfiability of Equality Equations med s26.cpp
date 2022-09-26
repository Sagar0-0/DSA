#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int alphabet_size[26];
    int find(int x){
        return alphabet_size[x] == x ? x: find(alphabet_size[x]);
    }
    bool equationsPossible(vector<string>& equations) {
        int n = (int) equations.size();
        
        for(int i =0; i<26; i++) alphabet_size[i]=i;
        
        for(auto x : equations){
            if(x[1]== '='){
                alphabet_size[find(x[0]-'a')] = find(x[3]-'a');
            }
        }
//         handle != case
        for(auto x : equations){
            if(x[1]== '!' && find(x[0]-'a') == find(x[3]-'a')){
                return false;
            }
        }
            return true;
    }
};