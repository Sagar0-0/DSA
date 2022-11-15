// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstring(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int longestSubstring(String S) {
        
        int n = S.length();
        Map<Integer, Integer> index = new HashMap<>();
      
        // Initialize answer with 0 
        int answer = 0;
      
        int mask = 0;
        index.put(mask, -1);
        
        for(int i = 0; i < n; i++){
            int temp = (int)S.charAt(i) - 97;
            // Turn the temp-th bit on if 
            // character occurs odd number 
            // of times and turn off the temp-th 
            // bit off if the character occurs 
            // ever number of times 
            mask ^= (1 << temp);
            // If a mask is present in the index 
            // Therefore a palindrome is 
            // found from index[mask] to i 
            if (index.containsKey(mask)){ 
                answer = Math.max(answer, i - index.get(mask)); 
            }
            // If x is not found then add its 
            // position in the index dict. 
            else
                index.put(mask,i); 
            
            // Check for the palindrome of 
            // odd length 
            for (int j = 0;j < 26; j++){
                // We cancel the occurrence 
                // of a character if it occurs 
                // odd number times 
                int mask2 = mask ^ (1 << j);
                if (index.containsKey(mask2))
                { 
                    answer = Math.max(answer, 
                        i - index.get(mask2)); 
                }
            }
        }
        return answer;
    }
};