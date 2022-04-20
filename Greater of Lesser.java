public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int i=0;
        int j=0;
        for(int num:A){
            if(num>C)i++;
        }
        for(int num:B){
            if(num<C)j++;
        }
        return Math.max(i,j);
    }
}
