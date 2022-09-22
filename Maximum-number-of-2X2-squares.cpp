class Solution
{
    public:
    long long int numberOfSquares(long long int base)
    {
        long long int h=(base/2)-1;
        long long int ans=h*(h+1)/2;
        return ans;
    }
};
