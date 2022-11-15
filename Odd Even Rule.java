public class Solution {
    public int solve(int[] A, int B, int C) {
        boolean even= B%2==0;
        int fine=0;
        if(even){
            for(int i:A){
                if(i%2!=0)fine+=C;
            }
        }else{
            for(int i:A){
                if(i%2==0)fine+=C;
            }
        }
        return fine;
    }
}
