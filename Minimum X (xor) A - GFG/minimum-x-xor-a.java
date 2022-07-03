// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            System.out.println(ob.minVal(a, b));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
   public static int minVal(int a, int b) {
       // code here
       if(count(a)==count(b))
           return a;
       int count = count(b);
       int x=a;
       while(count(x)<count)
           x++;
       while(count(x)>count)
           x--;
       while(count(x)==count)
       {
           int xor1 = ((x+1)^a);
           int xor2 = x^a;
           if(xor1<xor2)
               x++;
           else
               break;
           while(count(x)<count)
               x++;
       }
       if(count(x)>count)
           x--;
       return x;
   }
   static int count(int num)
   {
       int count = 0, temp = num;
       while(temp!=0)
       {
           count += temp%2;
           temp = temp>>1;
       }
       return count;
   }
}