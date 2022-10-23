//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        int[] ans=new int[R*C];
        int idx=R*C-1;
        
        int up=0;
        int down=a.length-1;
        int left=0;
        int right=a[0].length-1;
        
        
        
        while(idx>=0){
            //upper row
            for(int i=left;i<=right && idx>=0;i++){
                ans[idx--]=a[up][i];
            }
            up++;
            
            //last col
            for(int i=up;i<=down && idx>=0;i++){
                ans[idx--]=a[i][right];
            }
            right--;
            
            //lower row
            for(int i=right;i>=left && idx>=0;i--){
                ans[idx--]=a[down][i];
            }
            down--;
            
            for(int i=down;i>=up && idx>=0;i--){
                ans[idx--]=a[i][left];
            }
            left++;
        }
        
        return ans;
        
    }
}