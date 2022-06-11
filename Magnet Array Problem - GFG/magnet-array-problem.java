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
            double a[] = new double[(int)(n)];
            double getAnswer[] = new double[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Double.parseDouble(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.nullPoints(n, a, getAnswer); 
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n-1;i++)
                output.append(String.format("%.2f", getAnswer[i])+" ");
                
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void nullPoints(int n, double magnets[], double getAnswer[])
    {
        for(int i=0;i<n-1;i++){
            getAnswer[i]=solve(n,magnets,magnets[i],magnets[i+1]);
        }
    }
    public double solve(int n,double arr[],double low,double high){
        while(low<high){
            double mid=(low+high)/2.0;
            double frc=force(arr,n,mid);
            if(Math.abs(frc)<0.0000001){
                return mid;
            }else if(frc<0){
                high=mid;
            }else{
                low=mid;
            }
        }
        return low;
    }
    public double force(double arr[],int n,double mid){
        double frc=0.00;
        for(int i=0;i<n;i++){
            frc+=1/(mid-arr[i]);
        }
        return frc;
    }
}


