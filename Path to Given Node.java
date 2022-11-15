vpublic class Solution {
    int target;
    ArrayList<Integer> ans=new ArrayList<>();
    public ArrayList<Integer> solve(TreeNode A, int B) {
        target=B;
        solve(A,new ArrayList<Integer>());
        return ans;
    }
    public void solve(TreeNode curr,ArrayList<Integer> arr){
        if(curr==null)return;
        arr.add(curr.val);
        if(curr.val==target){
            ans=arr;
            return;
        }else{
            if(curr.left!=null){
                solve(curr.left,(ArrayList)arr.clone());
            }
            if(curr.right!=null){
                solve(curr.right,(ArrayList)arr.clone());
            }
        }
    }
}
