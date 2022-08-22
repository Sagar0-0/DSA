class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0)return false;
        int x=(int)(Math.log(n)/Math.log(4));
        if(Math.pow(4,x)==n)return true;
        return false;
    }
}