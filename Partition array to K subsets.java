class Solution
{
    public boolean isKPartitionPossible(int a[], int n, int k)
    {
	// Your code here	
	    int sum=0;
	    for(int i:a)sum+=i;
	    
	    if(sum%k != 0)return false;
	    
	    int target=sum/k;
	    int[] subsets=new int[k];
	    Arrays.sort(a);
	    
	    return dfs(a,subsets,n-1,target);
    }
    
    boolean dfs(int[]a,int[]subsets,int ind,int target){
        if(ind==-1)return true;
        
        for(int i=0;i<subsets.length;i++){
            if(subsets[i]+a[ind] >target)continue;
            subsets[i]+=a[ind];
            if(dfs(a,subsets,ind-1,target)){
                return true;
            }
            subsets[i]-=a[ind];
        }
        return false;
    }
}
