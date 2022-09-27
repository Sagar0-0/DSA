class Solution {
public:
    string pushDominoes(string s) {
        int right = -1;
        for(int i = 0; i < s.length(); i++){
            if(s[i] == 'L'){
                if(right == -1){
                    for(int j = i-1; j >= 0 && s[j] == '.'; j--){
                        s[j] = 'L';
                    }
                }else{
                    int idx = i-1;
                    int j = right+1;
                    while(j < idx){
                        s[j] = 'R';
                        s[idx] = 'L';
                        idx--;
                        j++;
                    }
                    right = -1;
                }
            }
            else if(s[i] == 'R'){
                if(right != -1){
                    for(int j = right+1; j < i; j++){
                        s[j] = 'R';
                    }
                }
                right = i;
            }
        }
        if(right != -1){
            for(int j = right+1; j < s.length(); j++){
                s[j] = 'R';
            }
        }
        return s;
    }
};
