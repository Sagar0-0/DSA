public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] arr) {
        int n=arr.length;
        int lmin[]=new int[n];
        int rmax[]=new int[n];
        int ans=-1;
        lmin[0]=arr[0];
        rmax[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
            lmin[i]=Math.min(lmin[i-1],arr[i]);
        for(int i=n-2;i>=0;i--)
            rmax[i]=Math.max(rmax[i+1],arr[i]);
        int i=0,j=0;
        while(i<n && j<n){
            if(lmin[i]<=rmax[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else
                i++;
        }
        return ans;
    }
}
