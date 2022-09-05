
class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        int ans=Integer.MAX_VALUE;
        int curSum=0;
        for(int i=0;i<size;i++){
            curSum+=a[i];
            ans=Math.min(ans,curSum);
            if(curSum>0)curSum=0;
        }
        return ans;
    }
}
