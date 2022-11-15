class Solution 
{ 
    void prank(long[] a, int n)  
    { 
        for(int i=0;i<n;i++){
            a[i]=a[i]+(a[(int)a[i]]%n)*n;
        }
        for(int i=0;i<n;i++)
            a[i]/=n;
   }
} 


===================================================================
    
    class Solution 
{ 
    void prank(long[] a, int n)  
    { 
       // code here
       long[] b=new long[n];
       for(int i=0;i<n;i++){
           long temp=a[i];
           b[i]= a[(int)temp];
          }
       for(int i=0;i<n;i++)
       {
           a[i]=b[i];
       }
      
   }
} 
