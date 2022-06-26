// { Driver Code Starts
//Initial Template for Java


//Initial Template for Java


import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class Solution
{ 
    // Method to calculate distinct sub-array 
    static int countDistinctSubarray(int arr[], int n) 
    { 
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr)set.add(i);
            
        for(int j = 0,i = 0;i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
            
            if(map.size() == set.size())
                res = res + (arr.length - i);
                
            while(map.size() >= set.size() && j <= i){
                map.put(arr[j],map.get(arr[j]) - 1);
                
                if(map.get(arr[j]) <= 0)
                    map.remove(arr[j]);
                    
                if(map.size() == set.size())
                    res = res + (arr.length - i);
                    
                j++;
            }
        }
        
        return res;
    }
}

// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		    }
		    Solution ob=new Solution();
		    int ans=ob.countDistinctSubarray(a,n);
		    System.out.println(ans);
		    
		}
	}
}
  // } Driver Code Ends