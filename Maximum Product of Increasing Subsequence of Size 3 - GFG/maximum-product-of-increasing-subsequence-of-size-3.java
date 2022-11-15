// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
	        
		    Solution obj = new Solution();
		    ArrayList<Integer> ans;
		    ans = obj.maxProductSubsequence(arr, N);
        	if(ans.get(0) == -1)
        	    System.out.println("Not Present");
        	else{
        	    for(int i: ans)
        	        System.out.print(i + " ");
        	    System.out.println();
        	}
        	
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
   
    public static ArrayList<Integer> maxProductSubsequence (int arr[], int n) {
        long ans = 0; 
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(-1);
      
        TreeSet<Integer> left = new TreeSet<>();
        left.add(arr[0]);
        
        int max[] = new int[n];
        max[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max[i] = Math.max(arr[i], max[i + 1]);
        }
        
        for (int i = 1; i < n - 1; i++) {
            Integer l = left.floor(arr[i] - 1);
            int r = max[i + 1];
            
            if (l != null && r > arr[i] && ((long) arr[i]) * l * r > ans) {
                ans = ((long) arr[i]) * l * r;
                list.clear();
                list.add(l);
                list.add(arr[i]);
                list.add(r);
            }
            left.add(arr[i]);
        }
        
        return list;
    }
}

