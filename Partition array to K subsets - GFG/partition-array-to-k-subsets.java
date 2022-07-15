// { Driver Code Starts
import java.util.*;

class Partition_Arr_To_K_Subsets
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();
			Solution g = new Solution();
			if(g.isKPartitionPossible(a,n,k)==true)
				System.out.println(1);
			else 
				System.out.println(0);
			
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete this method */
class Solution {
    public boolean isKPartitionPossible(int[] arr,int n, int k) {
        int sum=0;
        for(int i:arr) sum+=i;
        if(sum%k!=0) return false;
        Arrays.sort(arr);
        
        return (dfs(n-1,arr,new int[k],k,sum/k));
    }
    public boolean dfs(int ind,int[] arr,int[] sum, int k,int target){
        if(ind == -1)return true;
        for(int i=0;i<k;i++){
            if((sum[i] + arr[ind]>target) || (i>0 && sum[i] == sum[i-1]))continue;
            
            sum[i]+=arr[ind];
            
            if(dfs(ind-1,arr,sum,k,target))return true;
            sum[i]-= arr[ind];
        }
        return false;
    }
}
