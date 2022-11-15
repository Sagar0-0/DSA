public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode prev=null;
        Queue<TreeLinkNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int sz=q.size();
            prev=null;
            for(int i=0;i<sz;i++){
                TreeLinkNode cur=q.remove();
                if(prev==null){
                    prev=cur;
                }else{
                    prev.next=cur;
                    prev=prev.next;
                }
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
            }
            prev.next=null;
        }
    }
}
