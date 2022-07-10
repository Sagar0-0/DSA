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
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    
		    
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.reaching_height(N, arr);
        	
        	if(ans.size() == 1 && ans.get(0) == -1){
        	    System.out.println("Not Possible");
        	    continue;
        	}
        	
        	for(int i: ans)
        	    System.out.print(i + " ");
        	System.out.println();
		}
	}
}






// } Driver Code Ends


//User function Template for Java
//2 4 10
//10 2 4



class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> reaching_height (int n, int arr[]) {
        //Complete the function
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(arr);
        int flag=0;
        
        int end=arr.length-1;
        int start=0;
        while(end>=start){
            ans.add(arr[end]);
            flag+=arr[end];
            if(end!=start){
                ans.add(arr[start]);
                flag-=arr[start];
            }
            end--;
            start++;
        }
        if(flag==0){
            ans.clear();
            ans.add(-1);
        }
        
        return ans;
    }
    
    
}
