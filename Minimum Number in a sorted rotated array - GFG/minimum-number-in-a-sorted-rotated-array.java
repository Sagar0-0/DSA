// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(st[i]);
              
            System.out.println(new Solution().minNumber(arr,0,n-1));
        }
    }
    
}// } Driver Code Ends




class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int l, int h){
        while(l<=h){
            int m=(l+h)/2;
            if(m==0 || arr[m-1]>arr[m])
                return arr[m];
            if(arr[m]<arr[h])
                h=m-1;
            else if(arr[m]>arr[h])
                l=m+1;
        }
        return -1;
    }
}