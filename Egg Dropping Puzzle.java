class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int n, int k) 
	{
	    // Your code here
	    int[][]dp=new int[n+1][k+1];
	    
	    //eggs are 1
	    for(int j=1;j<=k;j++){
	        dp[1][j]=j;
	    }
	    
	    //f;oors are 1
	    for(int i=0;i<=n;i++){
	        dp[i][1]=1;
	    }
	    
	    for(int i=2;i<=n;i++){
	        for(int j=2;j<=k;j++){
	            int res=j;
	            
	            for(int t=1;t<=j;t++){
	                //break
	                int temp1=1+ dp[i-1][t-1];
	                //not break
	                int temp2=1+ dp[i][j-t];
	                //worst case  
	                int ans=Math.max(temp1,temp2);
	                res=Math.min(res,ans);
	            }
	            dp[i][j]=res;
	        }
	    }
	    
	    return dp[n][k];
	    
	}
}
