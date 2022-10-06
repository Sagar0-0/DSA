class Solution{
  public:
    char nthCharacter(string S, int R, int N) {
        bool flip = false;
  
        while (R --){
            flip ^= N & 1;
            N >>= 1;
        }
           
        return S[N] ^ flip;
    }
};
