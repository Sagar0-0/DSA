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
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        // code here
        List<String> ans=new ArrayList<>();
        dfs(dict,s,"",ans);
        return ans;
    }
    static void dfs(List<String> dict,String s,String sentence,List<String> ans){
        if(s.length()==0){
            ans.add(sentence.substring(0,sentence.length()-1));
        }
        
        for(int i=0;i<s.length();i++){
            String word=s.substring(0,i+1);
            if(dict.contains(word)){
                String temp=s.substring(i+1);
                dfs(dict,temp,sentence+word+" ",ans);
            }
        }
    }
}