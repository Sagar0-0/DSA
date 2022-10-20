class Solution {
/*      
        SOLUTION 1::
        
    int check(int n, int x, int y, int z){
        while(n){
            int r = n % 10;
            n /= 10;
            if(r < 4 || r > 6){
                return 0;
            }
            else{
                if(r == 4){
                    x--;
                }
                else if(r == 5){
                    y--;
                }
                else{
                    z--;
                }
            }
        }
        if(x < 0 || y < 0 || z < 0){
            return 0;
        }
        return 1;
    }
  public:
    int getSum(int X, int Y, int Z) {
        // Your code goes here
        int maxNum = 0, ans = 0;
        for(int i=0; i<Z; i++){
            maxNum = maxNum * 10 + 6;
        }
        for(int i=0; i<Y; i++){
            maxNum = maxNum * 10 + 5;
        }
        for(int i=0; i<X; i++){
            maxNum = maxNum * 10 + 4;
        }
        for(int i=0; i<=maxNum; i++){
            if(check(i, X, Y, Z)){
                ans += i;
            }
        }
        return ans;
    }
*/

//SOLUTION 2::
public:
    int getSum(int x, int y, int z) {

        int mod = (int)(1e9 + 7);

        // exactsum[i][j][k] stores the sum of
        // all the numbers having exact
        // i 4's, j 5's and k 6's
        long long exactsum[x + 1][y + 1][z + 1];

        // exactnum[i][j][k] stores numbers
        // of numbers having exact

        // i 4's, j 5's and k 6's
        long long exactnum[x + 1][y + 1][z + 1];

        memset(exactnum, 0, sizeof exactnum);
        memset(exactsum, 0, sizeof exactsum);

        long long ans = 0;
        exactnum[0][0][0] = 1;

        for (int i = 0; i <= x; ++i) {
            for (int j = 0; j <= y; ++j) {
                for (int k = 0; k <= z; ++k) {

                    // Computing exactsum[i][j][k]
                    // as explained above
                    if (i > 0) {
                        exactsum[i][j][k] += (exactsum[i - 1][j][k] * 10 +
                                              4 * exactnum[i - 1][j][k]) %
                                             mod;
                        exactnum[i][j][k] += exactnum[i - 1][j][k] % mod;
                    }
                    if (j > 0) {
                        exactsum[i][j][k] += (exactsum[i][j - 1][k] * 10 +
                                              5 * exactnum[i][j - 1][k]) %
                                             mod;
                        exactnum[i][j][k] += exactnum[i][j - 1][k] % mod;
                    }
                    if (k > 0) {
                        exactsum[i][j][k] += (exactsum[i][j][k - 1] * 10 +
                                              6 * exactnum[i][j][k - 1]) %
                                             mod;
                        exactnum[i][j][k] += exactnum[i][j][k - 1] % mod;
                    }

                    ans += exactsum[i][j][k] % mod;
                    ans %= mod;
                }
            }
        }

        return (int)ans;
    }
};
