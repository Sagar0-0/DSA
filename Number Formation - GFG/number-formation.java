//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.getSum(x, y, z));
        }
    }
}
// } Driver Code Ends


// User Function template for JAVA

class Solution {
    public int getSum(int X, int Y, int Z) {
        int mod = 1000000007;
    
        long exactsum[][][] = new long[X + 1][Y+ 1][Z + 1];
        long exactnum[][][] = new long[X + 1][Y + 1][Z + 1];
        long ans = 0L;

        exactnum[0][0][0] = 1L;

        for (int i = 0; i <= X; ++i) {

            for (int j = 0; j <= Y; ++j) {

                for (int k = 0; k <= Z; ++k) {

                    if (i > 0) {

                        exactsum[i][j][k] += (exactsum[i - 1][j][k]*10 + 4*exactnum[i - 1][j][k]) %mod;
                        exactnum[i][j][k] += exactnum[i - 1][j][k] % mod;

                    }

                    if (j > 0) {

                        exactsum[i][j][k] += (exactsum[i][j - 1][k] * 10 +5 * exactnum[i][j - 1][k]) %mod;

                        exactnum[i][j][k] += exactnum[i][j - 1][k] % mod;

                    }

                    if (k > 0) {

                        exactsum[i][j][k] += (exactsum[i][j][k - 1] * 10 +6 * exactnum[i][j][k - 1]) %mod;

                        exactnum[i][j][k] += exactnum[i][j][k - 1] % mod;

                    }

                    ans += exactsum[i][j][k] % mod;

                    ans %= mod;

                }

            }

        }

        return (int)ans;

    }

}