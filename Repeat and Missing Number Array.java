public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {

        long sum, actsum, sqsum, actsqsum;
        sum = actsum = sqsum = actsqsum = 0;
        for(long i : A){
            actsum += i;
            actsqsum += i*i;
        }
        long n = A.length;
        sum = (n * (n+1))/2;
        sqsum = (n*(n+1)*(2*n+1))/6;

        long  x = sum - actsum;
        long  y = (sqsum - actsqsum)/x;
        long  a = (x+y)/2;
        long  b = a - x;
        int [] out = {(int)b,(int)a};
    
        return out;

    }

}

