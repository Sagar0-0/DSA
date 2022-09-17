class Solution {
    public static int minimumSwaps(int[] c, int[] v,int n,int k,int b,int t) {
        // code here
        int swap=0,cnt=0;

    for(int i=n-1;i>=0;i--)

    {

        int val=c[i]+v[i]*t; //pos+speed*time

        if(val<b)   //if sheep not reaching so it is slow sheep 

        cnt++;          //slow sheeps 

        else

        {

            k--;

            swap+=cnt;  //add slow sheeps count into swap

            if(k==0)

            return swap;

        }

    }

    return -1;
    }
}