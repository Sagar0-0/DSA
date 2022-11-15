// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
        	String input_line[] = read.readLine().trim().split("\\s+");
        	int x = Integer.parseInt(input_line[0]);
        	int y = Integer.parseInt(input_line[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestPath(x,y));
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution {
    Map<Integer,Integer> map;
    int shortestPath( int x, int y){ 
        int max=Math.max(x,y);
        int min=Math.min(x,y);
        int ans=0;
        while(max!=min){
            max/=2;
            ans++;
            if(max<min){
                min/=2;
                ans++;
            }
        }
        return ans;
    }
}