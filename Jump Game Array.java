class Solution {
    static int canReach(int A[], int N) {
        int step=0;
        for(int i=N-2;i>=0;i--)
        {
            step++;
            if(A[i]>=step)step=0;
        }
        if(step==0)return 1;
        return 0;
    } 
}
