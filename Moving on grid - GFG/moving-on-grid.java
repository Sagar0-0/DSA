// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int r = Integer.parseInt(input[0]); 
            int c = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.movOnGrid(r,c));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public String movOnGrid(int r, int c){
        r=(r-1)%7;
        c=(c-1)%4;
        return(r==c?"ARYA":"JON");
   }
}