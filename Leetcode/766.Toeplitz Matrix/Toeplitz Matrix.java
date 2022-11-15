Solution 1:

Backward Comparison: Comparison with previous diagonal cee

Time Complexity:O(N*M)
Space Complexity:O(N*M)
Auxiliary Space:O(1)
  
LeetCode Time: 1 ms faster than 93.83%
LeetCode Memory: 45.2MB less than 80.01%
  

  boolean flag=false;
        int n=arr.length;
        int m=arr[0].length;
       for(int i=01;i<n;i++){
           for(int j=01;j<m;j++){
               int a=arr[i][j];
               int b=arr[i-1][j-1];
               if(a==b){
                   flag=true;
                                   
               }
               else{
                   return false;
               }
               
           }
       }
        return true;


========================================================================================================================================================================
  
Solution 2:

Forward Comparison: Comparison with next diagonal cee

Time Complexity:O(N*M)
Space Complexity:O(N*M)
Auxiliary Space:O(1)
  
LeetCode Time: 0 ms faster than 100.00%
LeetCode Memory: 42MB less than 96.94%
  
   int n=arr.length;
   int m=arr[0].length;
 for(int i=0;i<n-1;i++){
           for(int j=0;j<m-1;j++){
               int a=arr[i][j];
               int b=arr[i+1][j+1];
               if(a!=b){
                  return false;
                                   
               }
             
           }
       }
        return true;






  

