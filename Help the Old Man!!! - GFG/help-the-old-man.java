// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int n = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.shiftPile(N, n);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}// } Driver Code Ends

class Solution{
    public static void hanoi(int N,int A,int B,int C,ArrayList<ArrayList<Integer>> r){
            if(N==0)return;
            hanoi(N-1,A,C,B,r);
            ArrayList<Integer> z=new ArrayList<Integer>();
            z.add(A);
            z.add(B);
            r.add(z);
            hanoi(N-1,C,B,A,r);
    }
    static List<Integer> shiftPile(int N, int n){
        ArrayList<ArrayList<Integer>> r=new ArrayList<ArrayList<Integer>>();
        hanoi(N,1,3,2,r);
        return r.get(n-1);
    }
}