// { Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[10000];
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            solver x = new solver();
            int res[]=x.print_next_greater_freq(arr,n);
            StringBuffer sb=new StringBuffer("");
            for(int i : res){
                sb.append(i+" ");
            }
            System.out.println(sb);
        }
    }
}
// } Driver Code Ends


class solver
{
    static int[] print_next_greater_freq(int arr[], int n)
    {
        int[]freq=new int[10001];
        for(int i:arr){
            freq[i]++;
        }
        int ans[]=new int[n];
        ans[n-1]=-1;
        for(int i=0;i<n-1;i++){
            boolean got=false;
            for(int j=i+1;j<n;j++){
                if(freq[arr[j]]>freq[arr[i]]){
                    ans[i]=arr[j];
                    got=true;
                    break;
                }
            }
            if(!got){
                ans[i]=-1;
            }
        }
        return ans;
    }
}

