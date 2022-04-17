// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            long num = Long.parseLong(br.readLine().trim());
            Solution obj = new Solution();
            long ans = obj.closestPalindrome(num);
            System.out.println(ans);

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long closestPalindrome(long num)
    {
        // Code here
       if(num<=9) return num;
	        
	        if(check(num)) return num-1;
	        
	        String s = Long.toString(num);
	        if(isPall(s)){
	            
	            return num;
	        }
	        StringBuilder sb = new StringBuilder();
	        
	        boolean flag = false;
	        if(s.length()%2==1) flag = true;
	        
	        for(int i=0;i<s.length()/2;i++){
	            sb.append(s.charAt(i));
	        }
	        if(flag){
	            sb.append(s.charAt(s.length()/2));
	        }
//	        System.out.println(sb);
	        long n = Long.parseLong(sb.toString());
            
            long fir = n+1;
            long sec = n-1;
//            System.out.println(fir);
            StringBuilder sb1 = new StringBuilder(Long.toString(fir));
            
            int i=sb1.length()-1;
            if(flag) {
            	i--;
            }
            while(i>=0) {
            	sb1.append(sb1.charAt(i--));
            }
            StringBuilder sb2 = new StringBuilder(Long.toString(sec));
            
             i=sb2.length()-1;
             if(flag) {
	            	i--;
	            }
            while(i>=0) {
            	sb2.append(sb2.charAt(i--));
            }
//            System.out.println(sb1+" "+sb2);
            long a = Long.parseLong(sb1.toString());
            long b = Long.parseLong(sb2.toString());
	        
	        i=sb.length()-1;
	        if(flag) i--;
	        while(i>=0) {
            	sb.append(sb.charAt(i--));
            }
	        
	        long c =  Long.parseLong(sb.toString());
	        long diff = Math.abs(c-num);
	        
	        long min = Math.min(a-num, Math.min(diff, num-b));
	       // System.out.println(c);
	        if(min==num-b && min==diff) return Math.min(b,c);
	        else if(min==a-num && min==diff) return Math.min(a,c);
	        else if(min==num-b) return b;
	        else if(min==a-num) return a;
	        
	        else return c;
        
    }
    private static boolean check(long num){
        while(num>1 && num%10==0){
            num/=10;
            
        }
        return num==1;
    }
    private static boolean isPall(String s){
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        
        return s.equals(sb.toString());
    }
}