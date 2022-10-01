```java
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        // if current node is null, return null
        // this can happen only if the tree is empty or if the key does not exist in the tree
        if (root == null) return null;
        
        // if current node's value is equal to key, then simply delete it
        if (root.val == key) {
            // straightforward case where node is leaf node, then just delete it
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null) {
                // if the left child exists, then the node to attach is the left child's rightmost descendant
                // and we should return the current node's left child as the new root for its parent to attach to
                TreeNode newRoot = root.left;
                TreeNode attach = newRoot;
                while (attach.right != null) {
                    attach = attach.right;
                }
                // attach the deleted nodes' right child to the right of the node to attach
                attach.right = root.right;
                return newRoot;
            } else {
                // if the right child exists, then the node to attach is the right child's leftmost descendant
                // and we should return the current node's right child as the new root for its parent to attach to
                TreeNode newRoot = root.right;
                TreeNode attach = newRoot;
                while (attach.left != null) {
                    attach = attach.left;
                }
                // attach the deleted nodes' left child to the left of the node to attach
                attach.left = root.left;
                return newRoot;
            }
        }
        
        // if the key is not equal to the current node's value, keep searching for the key using BST property
        // attach the current node to the result of the deletion (which will either return the original child or a new child if the child is deleted)
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            root.left = deleteNode(root.left, key);
        }
        
        // return current node
        return root;
    }
}
```
