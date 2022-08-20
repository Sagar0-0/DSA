class Solution {
public:
    int minAddToMakeValid(string s) {        
        int n = s.size();
        int a=0, b=0;
        for(int i=0;i<n;i++){
            if(s[i] == '(') a++;
            else{
                if(a==0) b++; // if close bracket comes before open like ))(()) or (())((
                else a--; // if valid parenthesis is found till that index like (())/*till here a=0 and b=0*/(( and here b=2 and a=0
            }
        }
        return a + b;
    }
};
