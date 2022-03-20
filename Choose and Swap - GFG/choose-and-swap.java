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
        // Code Here
        
        Set<Character> s = new TreeSet<>(); //take TreeSet to store character in sorted order
        
        for(int i = 0;i<A.length();i++){
            s.add(A.charAt(i));
        }
        
        //taken an array to change the string while replacing.
        char[] arr = A.toCharArray();
        
        for(int i = 0;i<arr.length;i++){
            s.remove(arr[i]);
            if(s.isEmpty()){
                break;
            }
            char ch = s.iterator().next(); //get the 1st index of the set
            if(ch<arr[i]){
                char ch2 = arr[i];
                for(int j = 0;j<arr.length;j++){
                    if(arr[j]==ch){
                        arr[j] = ch2;
                    }else if(arr[j]==ch2){
                        arr[j] = ch;
                    }
                }
                break;
            }
        }
        A = String.valueOf(arr);
        return A;
    }
}