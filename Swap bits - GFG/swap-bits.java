// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int X = Integer.parseInt(input_line[0]);
            int P1 = Integer.parseInt(input_line[1]);
            int P2 = Integer.parseInt(input_line[2]);
            int N = Integer.parseInt(input_line[3]);
            
            Solution ob = new Solution();
            System.out.println(ob.swapBits(X, P1, P2, N));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    int swapBits(int x, int p1, int p2, int n){
        int  mask1= (x >> p1) & ((1 << n) - 1);
        int  mask2 = (x >> p2) & ((1 << n) - 1);
        int xor = ( mask1^ mask2);
        xor = (xor << p1) | (xor << p2);
        int res = x ^ xor;
        
        return res;
    }
}