class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
        Arrays.sort(arr,(a,b)->a.y-b.y);
        int ans=1;
        int prev=arr[0].y;
        for(int i=1;i<n;i++){
            if(arr[i].x>prev){
                prev=arr[i].y;
                ans++;
            }
        }
        return ans;
    }
}
