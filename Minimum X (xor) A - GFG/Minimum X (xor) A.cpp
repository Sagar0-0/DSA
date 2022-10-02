class Solution {
  public:
    int minVal(int a, int b) {
        // code here
        int na = __builtin_popcount(a);
        int nb = __builtin_popcount(b);
        int d = abs(na - nb);
        if(d == 0) return a;
        if(na > nb){
            while(d>0){
                a = a & (a-1);
                d--;
            }
        }else{
            while(d>0){
                a = a | (a+1);
                d--;
            }
        }
        return a;
    }
};
