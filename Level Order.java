public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode n=q.remove();
                arr.add(n.val);
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
            }
            ans.add(arr);
        }
        return ans;
    }
}
