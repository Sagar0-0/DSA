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
    ArrayList<String> ans;
    ArrayList<String> permutation(String S){
        ans=new ArrayList<>();
        helper("",S);
        return ans;
    }
    public void helper(String curr,String s){
        if(s.length()==0){
            ans.add(curr);
            return;
        }
        if(curr.length()==0){
            helper(s.charAt(0)+"",s.substring(1));    
            return;
        }
        helper(curr+" "+s.charAt(0),s.substring(1));
        helper(curr+s.charAt(0),s.substring(1));
    }
    
}