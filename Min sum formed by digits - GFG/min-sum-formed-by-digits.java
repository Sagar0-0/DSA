// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


//2 3 4 5 6 
//246
//35

class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        Arrays.sort(arr);
        long a=0;
        long b=0;
        int i=0;
        while(i<n){
            a= a*10 + arr[i];
            i++;
            if(i<n)b=b*10 +arr[i];
            i++;
        }
        return a+b;
    }
}