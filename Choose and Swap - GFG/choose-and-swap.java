// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        Solution obj = new Solution();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String A = read.readLine().trim();
            
            String ans = obj.chooseandswap(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    String chooseandswap(String A){
        int hash[] = new int[26]; 
        Arrays.fill(hash, -1);
        
        //get first occurence of every char
        for(int i=A.length()-1; i>=0; i--)
           hash[A.charAt(i)-97] = i;
        
        
        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i);
            char st = 'a';
            while(st < ch){
                if(hash[st-97]!=-1 && hash[st-97]>i){
                    String temp1 = A.replaceAll(String.valueOf(ch), "X");
                    String temp2 = temp1.replaceAll(String.valueOf(st), String.valueOf(ch));
                    String temp3 = temp2.replaceAll("X", String.valueOf(st));
                    return temp3;
                }
                st+=1;
            }
        }
        return A;
    }
}