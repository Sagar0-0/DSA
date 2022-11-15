public class Solution {
    public int solve(int A) {
        while(A>9){
            int temp=0;
            while(A!=0){
                temp+=(A%10);
                A/=10;
            }
            A=temp;
        }
        return A;
    }
}
