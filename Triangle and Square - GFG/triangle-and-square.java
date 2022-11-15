// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int B = Integer.parseInt(br.readLine());
			Solution obj = new Solution();
			int count = obj.countSquare(B);
			System.out.println(count);
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
	int countSquare(int B){
		//Write your code here
		B-=2;
		B/=2;
		return B*(B+1)/2;
	}
}