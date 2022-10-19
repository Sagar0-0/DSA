//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>(); 
            for(int i = 0; i < M; i++){
                ArrayList<Integer> e = new ArrayList<Integer>();
                e.add(Integer.parseInt(input_line[2*i]));
                e.add(Integer.parseInt(input_line[2*i+1]));
                Edges.add(e);
            }
            Solution ob = new Solution();
            if(ob.check(N, M, Edges)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int n;
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        // code here
        n=N;
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(ArrayList<Integer> edge:Edges){
            int src=edge.get(0);
            int des=edge.get(1);
            map.putIfAbsent(src,new ArrayList<>());
            map.putIfAbsent(des,new ArrayList<>());
            map.get(src).add(des);
            map.get(des).add(src);
        }
        
        Set<Integer> set=new HashSet<>();
        for(int node=1;node<=N;node++){
            if(dfs(node,set,map)){
                return true;
            }
        }
        return false;
    }
    boolean dfs(int curr,Set<Integer> set,Map<Integer,ArrayList<Integer>> map){
        set.add(curr);
        if(set.size()==n){
            return true;
        }
        
        for(int neb:map.get(curr)){
            if(!set.contains(neb) && dfs(neb,set,map)){
                return true;
            }
        }
        
        set.remove(curr);//back..
        return false;
    }
} 