class MyCalendar {

    class TreeNode{
        TreeNode left;
        TreeNode right;
        int start;
        int end;
        TreeNode(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    TreeNode root;
    public MyCalendar() {
       
    }
    
    public boolean book(int start, int end) {
       if(root == null){
           root = new TreeNode(start,end);
           return true;
       }
       return insert(root,start,end);
    }
    
    private boolean insert(TreeNode root, int start, int end){
        if(end <= root.start){
            if(root.left == null){
                root.left = new TreeNode(start,end);
                return true;
            }
            return insert(root.left,start,end);
        }
        if(start >= root.end){
            if(root.right == null){
                root.right = new TreeNode(start,end);
                return true;
            }
            return insert(root.right,start,end);
        }
        return false;
    }
}