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
            String s1 = br.readLine().trim();
            String []S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            long C = Long.parseLong(S1[1]);
            String s2 = br.readLine().trim();
            String []S2 = s2.split(" ");
            long [] w = new long[n];
            long [] p = new long[n];
            for(int i = 0; i < n; i++){
                w[i] = Long.parseLong(S2[2*i]);
                p[i] = Long.parseLong(S2[(2*i)+1]);
            }
            Solution ob = new Solution();
            double ans = ob.maximumProfit(n, C, w, p);
            String a1 = String.format("%.3f",ans);
            System.out.println(a1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Pair{
    long weight;
    long profit;
    double ratio;
    Pair(long weight, long profit, double ratio){
        this.weight=weight;
        this.profit=profit;
        this.ratio=ratio;
    }
}
class Solution
{
    public boolean isPerfect(long num){
        long sq=(long)Math.sqrt(num);
        return sq*sq==num;
    }
    public double maximumProfit(int n, long c, long w[], long p[])
    {
        Pair[] item=new Pair[n];
        for(int i=0;i<n;i++){
            item[i]=new Pair(w[i],p[i],(double)p[i]/(double)w[i]);
        }
        Arrays.sort(item, (a,b)->Double.compare(b.ratio, a.ratio));
        double total=0;
        int i=0;
        while(c>0){
            if(!isPerfect(item[i].weight)){
                long wgt=Math.min(c, item[i].weight);
                total+=(double)(wgt)*item[i].ratio;
                c-=wgt;
            }
            i++;
        }
        return total;
    }
}