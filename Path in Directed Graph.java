public class Solution {
    public int solve(int A, int[][] B) {
        Map<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=0;i<A;i++){
            map.put(i+1,new ArrayList<>());
        }
        for(int i=0;i<B.length;i++){
            ArrayList<Integer> arr=map.get(B[i][0]);
            arr.add(B[i][1]);
            map.put(B[i][0],arr);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        boolean[]vis=new boolean[A+1];
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                int ele=q.remove();
                if(ele==A)return 1;
                if(!vis[ele]){
                    q.addAll(map.get(ele));
                }
                vis[ele]=true;
            }
        }
        return 0;
    }
}

//----------------------------------------------------------------------------

public class Solution {
    public int solve(int A, int[][] B) {
        Map<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=0;i<A;i++){
            map.put(i+1,new ArrayList<>());
        }
        for(int i=0;i<B.length;i++){
            ArrayList<Integer> arr=map.get(B[i][0]);
            arr.add(B[i][1]);
            map.put(B[i][0],arr);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        boolean[]vis=new boolean[A+1];
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                int ele=q.remove();
                if(ele==A)return 1;
                if(!vis[ele]){
                    q.addAll(map.get(ele));
                }
                vis[ele]=true;
            }
        }
        return 0;
    }
}
