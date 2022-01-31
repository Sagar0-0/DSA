class Solution
{
    public static ArrayList<Integer> printCousins(Node root, Node find)
    {
        //code here
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.offer(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int sz=q.size();
            if(flag){
                while(!q.isEmpty()){
                    ans.add(q.remove().data);
                }
                break;
            }
            for(int i=0;i<sz;i++){
                Node node=q.remove();
                if(node.left==find || node.right==find){
                    flag=true;
                    continue;
                }
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
    }
}
