// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
   ArrayList<String> ans= new ArrayList<>();
   void helper(String a ,String b){
       if(b.length()==0){
           ans.add(a);
           return;
       }
       if(a.length()!=0)
           helper(a+" "+b.charAt(0),b.substring(1));
       helper(a+b.charAt(0),b.substring(1));
   }
   ArrayList<String> permutation(String S){
       // Code Here
       helper("",S.substring(0));
       return ans;
   }
   
}