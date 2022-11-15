// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.remove(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String remove(String s) {
        if(s.length()<=1) return s;
        StringBuilder str = new StringBuilder();
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1) ){
                int j =i;
                while(j<s.length() && s.charAt(i)==s.charAt(j) ) j++;
                i=j-1;
            }else str.append(s.charAt(i));
        }
        if(s.charAt(s.length()-2)!=s.charAt(s.length()-1)) str.append(s.charAt(s.length()-1));
        if(s.length()==str.length()) return s;
        return remove(str.toString());
   }
}