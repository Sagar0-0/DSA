class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
            for(int j=0;j<n;j++){
                if(graph[i][j]){
                    map.get(i).add(j);
                }
            }
        }
        int[]col=new int[n];//index===node, value==color nummber
        return dfs(map,0,col,n,m);
    }
    boolean dfs(Map<Integer,ArrayList<Integer>> map,int currNode,int[]col,int n,int m){
        if(currNode==n)return true;
        for(int currColor=1;currColor<=m;currColor++){
            if(safe(currNode,currColor,map,col)){
                col[currNode]=currColor;
                if(dfs(map,currNode+1,col,n,m))return true;
                col[currNode]=0;//backtracking
            }
        }
        return false;
    }
    
    boolean safe(int currNode,int currColor,Map<Integer,ArrayList<Integer>> map,int[]col){
        ArrayList<Integer> arr=map.get(currNode);
        for(int neb:arr){
            if(col[neb]==currColor)return false;
        }
        return true;
    }
}
