class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
        int ans=Integer.MAX_VALUE;
        int i=0, j=0, sum=0;
        while(j<a.length) {
            sum+=a[j];
            ans=Math.min(ans, sum);
            while(i<=j && sum>0) {  //In the question , they asked smallest sum contiguous sub array, hence we reduce the sum if sum>0 using sliding window
                sum-=a[i];
                i+=1;
            }
            j+=1;
        }
        return ans;

    }
}
