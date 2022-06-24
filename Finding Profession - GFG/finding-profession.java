// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int level = Integer.parseInt(a[0]);
            int pos = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            if(ob.profession(level, pos) == 'd')
                System.out.println("Doctor");
            else
                System.out.println("Engineer");
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
   static int countSetBits(int n)
   {
       int count = 0;
       while (n != 0)
       {
         n &= (n-1) ;
         count++;
       }
       return count;
   }
   static char profession(int level, int pos){
       // Count set bits in 'pos-1'
       int c = countSetBits(pos-1);
    
       // If set bit count is odd, then doctor, else engineer
       return (c%2 == 1)?  'd' : 'e';
   }
}