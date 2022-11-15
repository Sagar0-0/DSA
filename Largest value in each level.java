class Solution
{
    public ArrayList<Integer> largestValues(Node root)
    {
        //code here
        Map<Integer,Integer> map=new HashMap<>();
        dfs(root,1,map);
        ArrayList<Integer> ans=new ArrayList<>();
        int level=1;
        while(map.containsKey(level)){
            ans.add(map.get(level));
            level++;
        }
        return ans;
    }
    public void dfs(Node root,int level,Map<Integer,Integer> map){
        if(root==null)return;
        if(!map.containsKey(level)){
            map.put(level,root.data);
        }else{
            int cur=root.data;
            int init=map.get(level);
            map.put(level,Math.max(cur,init));
        }
        dfs(root.right,level+1,map);
        dfs(root.left,level+1,map);
    }
}
