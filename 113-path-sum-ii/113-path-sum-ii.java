class Solution {
    public void check(TreeNode root,int T,List<Integer> curr,List<List<Integer>> list){
        if(root == null){
            return;
        }
        if(T-root.val==0 && root.left == root.right){
            curr.add(root.val);
            list.add(new ArrayList<>(curr));
            curr.remove(curr.size()-1);
            return;
        }
        curr.add(root.val);
        check(root.left,T-root.val,curr,list);
        check(root.right,T-root.val,curr,list);
        curr.remove(curr.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        check(root,targetSum,curr,list);
        return list;
    }
}