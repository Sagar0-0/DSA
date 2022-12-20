class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        int n=rooms.size();
        boolean vis[]=new boolean[n];
        vis[0]=true;
        while(!q.isEmpty()){
            int val=q.remove();
            for(int next:rooms.get(val)){
                if(!vis[next]){
                    vis[next]=true;
                    q.add(next);
                }
            }
        }
        for(boolean b:vis){
            if(!b)return b;
        }
        return true;
    }
}