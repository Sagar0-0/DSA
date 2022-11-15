class Solution {
  public:
    unsigned long long int noOfWays(unsigned long long int n){
        // code here
        if(n<3){
            return n*2;
        }
        else{
              return ((n*n)-(n-2));
            }
    }
};
