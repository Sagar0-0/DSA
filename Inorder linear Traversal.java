public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> list=new ArrayList<>();
        Map<TreeNode,Boolean> map=new HashMap<>();
        Deque<TreeNode> stack=new ArrayDeque<>();
        stack.push(A);
        map.put(A,false);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(map.get(node)==false){
                if(node.right!=null){
                    stack.push(node.right);
                    map.put(node.right,false);
                }
                stack.push(node);
                if(node.left!=null){
                    stack.push(node.left);
                    map.put(node.left,false);
                }
                map.put(node,true);
            }else{
                list.add(node.val);
            }    
        }
        return list;
    }
}
