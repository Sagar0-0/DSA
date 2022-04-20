/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    TreeNode head;
    int i;
    List<Integer> list=new ArrayList<>();
    public BSTIterator(TreeNode root) {
        i=0;
        inOrder(root);
    }
    private void inOrder(TreeNode root){
        if(root==null)return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
    
    public int next() {
        int ans=list.get(i);
        i++;
        return ans;
    }
    
    public boolean hasNext() {
        return i!=list.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */