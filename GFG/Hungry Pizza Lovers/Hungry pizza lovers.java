// { Driver Code Starts
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
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [][] = new int[sizeOfArray][2];
		    
		    for(int i = 0;i<sizeOfArray;i++){
    		    line = br.readLine();
    		    String[] elements = line.trim().split("\\s+");
		        arr[i][0] = Integer.parseInt(elements[0]);
		        arr[i][1] = Integer.parseInt(elements[1]);
		    }
		    
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.permute(arr, sizeOfArray);
		    for(int i: ans)
		        System.out.println(i);
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> permute (int arr[][], int n) {
        Map<int[],Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i+1);
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0]+a[1],b[0]+b[1]));
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            ans.add(map.get(arr[i]));
        }
        return ans;
    }
    
    
}


