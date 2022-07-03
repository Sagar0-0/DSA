// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            List<String> dict = new ArrayList<String>();
            for(int i = 0;i < n;i++)
                dict.add(arr[i]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            List<String> ans = new ArrayList<String>();
            ans = ob.wordBreak(n, dict, s);
            if(ans.size() == 0)
                System.out.println("Empty");
            else{
                List<String> sol = ans.stream().sorted().collect(Collectors.toList());
                for(int i = 0;i < sol.size();i++)
                    System.out.print("("+sol.get(i)+")");
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static void dfs(List<String> dict, String s, String temp, List<String> solution){
        if(s.length()==0)solution.add(temp.substring(0,temp.length()-1));
        
        for(int i=0; i<s.length(); i++){
            String left = s.substring(0,i+1);
            if(dict.contains(left)){
                String right = s.substring(i+1);
                dfs(dict, right, temp + left + " ", solution);
            }
        }
    }
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        List<String> solution = new ArrayList<>();
        dfs(dict, s, "", solution);
        return solution;
    }
}