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
        StringBuilder str=new StringBuilder(s);
        while(str.length()>0){
            int count=0,i=1,n=str.length();
            List<Integer> arr=new ArrayList<>();
            char c=str.charAt(0);
            for(;i<n;i++){
                if(str.charAt(i)==c){
                    if(count==0)
                        count=2;
                    else
                        count++;
                }else{
                    if(count>0){
                        arr.add(i-count);
                        arr.add(i-1);
                    }
                    c=str.charAt(i);
                    count=0;
                }
            }
            if(count!=0){
                arr.add(i-count);
                arr.add(i-1);
            }
            if(arr.size()==0)
                break;
            for(int j=arr.size()-1;j>=1;j-=2){
                for(int k=arr.get(j);k>=arr.get(j-1);k--)
                    str.deleteCharAt(k);
            }
        }
        return str.toString();
    }
}