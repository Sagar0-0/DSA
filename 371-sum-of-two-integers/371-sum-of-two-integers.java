class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int ans=(a^b);
            int carry=(a&b)<<1;
            a=ans;
            b=carry;
        }
        return a;
    }
}