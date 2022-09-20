class Solution
{
    public static long numberOfSquares(long n)
    {
        //code here
        if(n<=3)return 0;
        if(n%2==0){
            n-=2;
        }else{
            n-=3;
        }
        n/=2;
        return n*(n+1)/2;
    }
}
