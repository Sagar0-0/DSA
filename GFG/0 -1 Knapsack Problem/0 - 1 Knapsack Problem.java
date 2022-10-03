class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    
  
  // below function is recursion+dp version of the problem, problem can be solved using only this function also
    static int myfunc(int w, int wt[], int val[], int n, int[][] ans){
        if(w==0 || n==0) return 0;
         if(ans[w][n]!=-1) return ans[w][n];
         if(wt[n-1]>w){
             return ans[w][n]=myfunc(w,wt,val,n-1,ans);
         }
         
         return ans[w][n] = Math.max(val[n-1] + myfunc(w-wt[n-1],wt,val,n-1,ans), myfunc(w,wt,val,n-1,ans));
    }
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         int[][] ans = new int[W+1][n+1];
         
        // below is the memoization version (iterative approach) of the problem 
         for(int i=1;i<W+1;i++){   
             for(int j=1;j<n+1;j++){
                 if(wt[j-1]>i){
                     ans[i][j] = ans[i][j-1];
                 }else{
                     ans[i][j] = Math.max(val[j-1]+ans[i-wt[j-1]][j-1],ans[i][j-1]);
                 }
             }
         }
        
        //  return myfunc(W, wt, val, n, ans);      // call for using recursion + dp approach
        return ans[W][n];
    } 
}
