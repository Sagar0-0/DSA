class Solution
{
    public:
    long long int numberOfSquares(long long int base)
    {
        if(base<4) return 0;
        
        long long temp = base/2;
        
        temp = (temp-1)*(temp)/2;
        
        return temp;
    }
};
