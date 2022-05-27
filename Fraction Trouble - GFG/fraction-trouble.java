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
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int d = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            int[] ans = ob.numAndDen(n,d);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int[] numAndDen(int n, int d)
    {
        int num = 0;
        int den = 1;
        for (int q = 10000; q >= 2; q--){
            int p = (n * q - 1) / d;
            if (p * den >= num * q){
                den = q;
                num = p;
            }
        }
        int tot = gcdnumber(num,den);
        int [] ans = new int[2];
        ans[0] = num/tot;
        ans[1] = den/tot;
        return ans;
    }
    
    static int gcdnumber(int a, int b)
    {
        if (b == 0)
            return a;
        return gcdnumber(b, a % b);
    }
}