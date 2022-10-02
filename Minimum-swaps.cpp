class Solution {
public:
    int minimumSwaps(int c[],int v[],int n,int k,int b,int T)
    {
        int g = 0, bad = 0, s = 0;
        for(int i = n-1; i >= 0; i--){
            if(v[i]*T+c[i] >= b){   //Distance = speed*time so a sheep can reach to barn if its postion*time+cost is greater than equal to barn position
                g++;                // If yes then we will not swap that sheep
                s += bad;           
            }else
                bad++;              // If not than that sheep can exploit other sheeps also which have higher
                                    //cost and are on left side of bad sheep so we increase count of bad sheeps
            if(g >= k) break;       // number of good sheeps is equal to k we will break and return no. of swap required
        }
        if(g >= k) return s;
        return -1;                  // else return -1;
    }
};
