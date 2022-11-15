public class Solution {
    public long solve(int A, int B) {
        long start=A;
        long end=B;
        while(start%7!=0)start++;
        while(end%7!=0)end--;
        if(start==end)return start;
        long e=end/7;
        long s=start/7;
        return apSum(e)-apSum(s)+start;
    }
    public long apSum(long n){
        return n*(14+((n-1)*7))/2;
    }
}
