// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for(int i = 0; i <= n; i++) {
            	graph.add(new ArrayList<>());
            }
            
            int temp = n;
            while(temp-- > 1){
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            Solution ob = new Solution();
            System.out.println(ob.countOfNodes(graph, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
   int countOfNodes(ArrayList<ArrayList<Integer>> graph, int n) 
   {
       // Write your code here
       Integer[] arr=new Integer[n+1];
       dfs(1,graph,arr,0);
       int ev=0,od=0;
       for(Integer i:arr)
       {
           if(i!=null)
           if(i%2==0)
           ev++;
           else
           od++;
       }
       return ev*(ev-1)/2+od*(od-1)/2;
   }
   static void dfs(int src,ArrayList<ArrayList<Integer>> adj,Integer[] arr,int di)
   {
       arr[src]=di;
       for(int i:adj.get(src))
       if(arr[i]==null)
       dfs(i,adj,arr,di+1);
   }
}

