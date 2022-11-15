/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    ArrayList<Integer> preorder, inorder;
    
	public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
	    
	    if (preorder == null || inorder == null || preorder.size() == 0 || inorder.size() == 0)
	        return null;
	    
	    if (preorder.size() != inorder.size())
	        return null;
	    
	    this.preorder = preorder;
	    this.inorder = inorder;
	    
	    return rec(0, preorder.size() - 1, 0);
	    
	}
	
	
	private TreeNode rec(int start, int end, int index) {
	    
	    if (start > end)
	        return null;
	    
	    TreeNode root = new TreeNode(preorder.get(index));
	    
	    int i = start;
	    
	    for (; i <= end; i++) {
	        if (inorder.get(i).intValue() == root.val)
	            break;
	    }
	    
	    root.left = rec(start, i - 1, index + 1);
	    root.right = rec(i + 1, end, index + i - start + 1);
	    
	    return root;
	}
	
}
