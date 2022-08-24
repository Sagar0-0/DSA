class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0)return false;
        int x=(int)(Math.log10(n)/Math.log10(3));
        if(Math.pow(3,x)==n)return true;
        return false;
    }
}