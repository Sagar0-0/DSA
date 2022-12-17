class Solution{
    int waysToBreakNumber(int N){
        // code here
        long n=N;
        return (int)(((3*n)+(n-1)*(n-2)/2)%1000000007);
    }
}
