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
            String str[] = read.readLine().split(" ");
            String S= str[0];
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            Solution ob = new Solution();
            System.out.println(ob.stringPartition(S,a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String stringPartition(String S, int a, int b){
        int n=S.length();
        String[]pre=new String[n-1];
        String[]post=new String[n-1];
        for(int i=0;i<n-1;i++){
            pre[i]=S.substring(0,i+1);
            post[i]=S.substring(i+1,n);
        }
        for(int i=0;i<n-1;i++){
            if(div(pre[i],a) && div(post[i],b)){
                return pre[i]+" "+post[i];
            }
        }
        return "-1";
    }
    static boolean div(String s,int a){
        int num=Integer.parseInt(s);
        if(num%a==0)return true;
        return false;
    }
}