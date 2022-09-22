class Solution {
    static int minTime;
    static int noOfRoads;
    static int countPaths(int n, List<List<Integer>> roads) {
        // Your code here
        minTime=Integer.MAX_VALUE;
        noOfRoads=0;
        Map<Integer,List<int[]>> map=new HashMap<>();// node -> list({des,time})
        for(List<Integer> curr:roads){
            int src=curr.get(0);
            int des=curr.get(1);
            int time=curr.get(2);
            map.putIfAbsent(src,new ArrayList<>());
            map.putIfAbsent(des,new ArrayList<>());
            map.get(src).add(new int[]{des,time});
            map.get(des).add(new int[]{src,time});
        }
        boolean[]vis=new boolean[n];
        dfs(0,map,vis,0);
        return noOfRoads;
    }
    static void dfs(int node,Map<Integer,List<int[]>> map,boolean[]vis,int currTime){
        if(node==vis.length-1){
            if(currTime<minTime){
                minTime=currTime;
                noOfRoads=1;
            }else if(currTime==minTime){
                noOfRoads++;
            }
            return;
        }
        if(currTime>minTime)return;
        vis[node]=true;
        //find in nebs
        List<int[]> nebList=map.get(node);
        if(nebList!=null){
            for(int[] neb:nebList){
                int des=neb[0];
                int time=neb[1];
                if(!vis[des]){
                    dfs(des,map,vis,currTime+time);
                }
            }
        }
        vis[node]=false;
    }
}
