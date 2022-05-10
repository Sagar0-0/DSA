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
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   public void fillArray(int[] res,int[] n, int s, int e, int[] i){
        if(s>e)return;
        int mid=s+(e-s)/2;
        res[i[0]]=n[mid];
        i[0]++; 
        fillArray(res,n,s,mid-1,i);
        fillArray(res,n,mid+1,e,i);
   }
   public int[] sortedArrayToBST(int[] n){
        int[] res=new int[n.length], i=new int[1];
        int s=0,e=n.length-1;
        fillArray(res,n,s,e,i);
        return res;
   }
}