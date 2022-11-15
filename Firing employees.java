class Solution {
    static int firingEmployees(int arr[], int n) { 
        // code here
        int ans=0;
        int[]dp=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]==0)continue;
            int rank=i+1;
            int val=rank+dfs(arr,i,dp);
            if(isPrime(val))ans++;
        }
        return ans;
    } 
    
    static int dfs(int[]arr,int ind,int[]dp){
        if(arr[ind]==0)return 0;
        if(dp[ind]!=0)return dp[ind];
        int seniors=1 + dfs(arr,arr[ind]-1,dp);
        return dp[ind]=seniors;
    }
    
    static boolean isPrime(int n)
    {
 
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
