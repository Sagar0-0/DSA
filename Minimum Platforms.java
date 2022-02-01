class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat=1;
        int max=1;
        int i=1;
        int j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                i++;
                plat++;
                max=Math.max(max,plat);
            }else{
                j++;
                plat--;
            }
        }
        return max;
    }
}
