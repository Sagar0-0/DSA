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
