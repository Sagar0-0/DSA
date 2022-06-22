// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t>0)
		{
		    String s = sc.next();
		    
		    Solution T = new Solution();
		    System.out.println(T.fun(s));
		    
		    t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   public int fun(String s){
       HashMap <Character, Integer> mp = new HashMap <>();
       
       mp.put('a',0);
       mp.put('b',0);
       mp.put('c',0);
       for(int i = s.length()-1;i >= 0;i--)
       {
           if(s.charAt(i) == 'c')
               mp.put('c', (2*mp.get('c')+1) % 1000000007 );
           else if(s.charAt(i) == 'b')
               mp.put('b', ( (2*mp.get('b'))% 1000000007 + mp.get('c') ) % 1000000007 );
           else if(s.charAt(i) == 'a')
               mp.put('a', ( (2*mp.get('a'))% 1000000007 + mp.get('b') ) % 1000000007 );
       }
             
       return mp.get('a');
   }
}