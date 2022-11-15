public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        return makeTree(A,0,A.length-1);
    }
    public TreeNode makeTree(int[]a,int start,int end){
        if(start>end)return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(a[mid]);
        if(start==end)return root;
        else{
            root.left=makeTree(a,start,mid-1);
            root.right=makeTree(a,mid+1,end);
        }
        return root;
    }
}
