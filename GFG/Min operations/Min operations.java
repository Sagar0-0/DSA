class Solution {

    public static int solve(int a, int b) {

        // code here

        if(a==b)return 0;

        if((a & b) == a || (a & b) == b)return 1;

        return 2;

    }

}    
