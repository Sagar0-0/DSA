public class Solution {
    public int sqrt(int A) {
        if (A == 0 || A == 1) return A;
        if (A == 2 || A == 3) return 1;
        int i=1;
        int j=A/2;
        int expect=0;
        while(i<=j){
            int m=i+(j-i)/2;

            if(m<=A/m){
                i=m+1;
                expect=m;
            }else{
                j=m-1;
            }
        }
        return expect;
    }
}
