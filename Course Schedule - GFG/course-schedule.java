// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);

            for (int i = 0; i < n; i++)
                list.add(i, new ArrayList<Integer>());

            ArrayList<ArrayList<Integer>> prerequisites = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(v).add(u);
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(u);
                pair.add(v);
                prerequisites.add(pair);
            }

            int[] res = new Solution().findOrder(n, m, prerequisites);
            
            if(res.length==0)
                System.out.println("No Ordering Possible");
            else
            {
                if (check(list, n, res) == true)
                    System.out.println("1");
                else
                    System.out.println("0");
            }
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}
// } Driver Code Ends

class Solution{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prereq){
        int indegree[] = new int[n];
        //Calculate the indegree of each node.
        for(int i=0; i<m; i++)
        {
            indegree[prereq.get(i).get(1)]++;
        }
        
        
        //Create and adjacency list.
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0; i<m; i++)
        {
            //The node which has any prerequisite points to its prerequisites.
            int node1 = prereq.get(i).get(0);
            int node2 = prereq.get(i).get(1);
            
            adj.get(node1).add(node2);
        }
        
        Queue<Integer> queue = new ArrayDeque<>();
        
        boolean visited[] = new boolean[n];
        
        for(int i=0; i<n; i++)
        {
            if(indegree[i]==0)
            {
                queue.add(i);
                visited[i] = true;
            }
            
        }
        
        
        int ans[] = new int[n];
        int count = 0;
        
        while(queue.isEmpty()==false)
        {
            int node = queue.poll();
            ans[count++] = node;
            visited[node] = true;
            
            for(int nei : adj.get(node))
            {
                if(visited[nei]==false)
                {
                    //Decrease the indegree of each unvisited neighbor.
                    indegree[nei]--;
                    
                    if(indegree[nei]==0)
                    {
                        //If the indegree is zero then we can add to the queue.
                        visited[nei] = true;
                        queue.add(nei);
                    }
                }
            }
            
            
        }
        
        //Check if every node is visited else return an empty array.
        for(int i=0; i<n; i++)
        {
            if(visited[i]==false) return new int[0];
        }
        
        
        //Reverse the answer
        for(int i=0; i<n/2; i++)
        {
            int temp = ans[i];
            ans[i] = ans[n-i-1];
            ans[n-i-1] = temp;
        }
        
        
        return ans;
        
    }
}