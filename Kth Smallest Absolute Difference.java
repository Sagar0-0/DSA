class Compute {
    
    public long kthDiff(long arr[], long n, long k)
    {
        Arrays.sort(arr);
        int diff= (int) (arr[(int)n-1]-arr[0]);
        int l=0;
        int h=diff;
        while(l<h){
            int m=(l+h)/2;
            if(ok(m,arr,(int)n,(int)k))
                h=m;
            else
                l=m+1;
        }
        return l;
    }
    public static boolean ok(int m,long[] arr,int n,int k){
        int j=1;
        int total=0;
        for(int i=0;i<n;i++){
            while(j<n && arr[j]-arr[i]<=m) j++;
            j--;
            int x=(j-i);
            total+=x;
        }
        return (total>=k);
    }
}
