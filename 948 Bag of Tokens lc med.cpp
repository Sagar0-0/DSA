class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
//         approach 2 pointer tech
        // sort, then define 2 pointer , start =0, and end
//         check
        sort(tokens.begin(), tokens.end());
        int left_start =0, right_end = tokens.size()-1;
        int score =0; // initializing score 0
        while(left_start<=right_end){
            if(power>=tokens[left_start]){
                
                power-=tokens[left_start++];
                score++;
            }else{
                if(power+tokens[right_end]>= tokens[left_start] && score!=0 && right_end !=left_start){
                    power+= tokens[right_end--];
                    score--;
                }else break;
            }
        }
        return score;
    }
};