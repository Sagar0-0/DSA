class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // return recursive traversal of tree
        return inOrderTraversal(q,p);
        
    }
    
    public boolean inOrderTraversal(TreeNode node1, TreeNode node2) {
        // initialize boolean result as true
        boolean result = true;
        
        // if one of the nodes is null and the other isn't, result is false
        if( (node1 == null && node2 != null) || (node2 == null && node1 != null) ) {
            result = false;
        }
        // else determine if node1 isn't null (if so, assumes both nodes aren't null)
        else if( node1 != null ) {
            // determine if node1 shares don't value with node2
            if( node1.val != node2.val ) {
                // if so, result is false
                result = false;
            }
            // else (assume node1 and node2 share value)
            else {
                // recursively call on left nodes
                result = inOrderTraversal(node1.left, node2.left);
                
                // if result is true for recursive call
                if( result == true ) {
                    // recursively call on right nodes
                    result = inOrderTraversal(node1.right, node2.right);
                }
            }
        }
        // return result
        return result;
    }
}