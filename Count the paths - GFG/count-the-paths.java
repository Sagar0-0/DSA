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
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int s = Integer.parseInt(S[2]);
            int d = Integer.parseInt(S[3]);
            int[][] edges = new int[m][2];
            for(int i = 0; i < m; i++){
                String[] S1 = br.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(S1[0]);
                edges[i][1] = Integer.parseInt(S1[1]);
            }
            Solution obj = new Solution();
            int ans = obj.possible_paths(edges, n, s, d);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    Map<Integer,ArrayList<Integer>> map;
    int ans;
    int des;
    public int possible_paths(int[][] edges, int n, int s, int d)
    {
        des=d;
        ans=0;
        map=new HashMap<>();
        for(int[]e:edges){
            int src=e[0];
            int des=e[1];
            map.putIfAbsent(src,new ArrayList<>());
            map.get(src).add(des);
        }
        
        dfs(s);
        return ans;
    }
    void dfs(int curr){
        if(curr==des){
            ans++;
            return;
        }
        if(!map.containsKey(curr))return;
        ArrayList<Integer> arr=map.get(curr);
        for(int neb:arr){
            dfs(neb);
        }
    }
}