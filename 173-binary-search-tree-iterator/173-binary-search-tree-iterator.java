class BSTIterator {
    
    Deque<TreeNode> stack = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }
    
    public int next() {
        TreeNode node = stack.pollFirst();
        pushLeft(node.right);
        return node.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    
    private void pushLeft(TreeNode root) {
        while (root != null) {
            stack.addFirst(root);
            root = root.left;
        }
    }
}