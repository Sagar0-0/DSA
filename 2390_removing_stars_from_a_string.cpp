class Solution {
public:
    string removeStars(string s) {
        int i =0;
        for(auto it: s){
            if(it=='*'){
                i--;
            }
            else{
                s[i++]=it;
            }
        }
        return s.substr(0,i);
    }
};
