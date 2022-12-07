
class Solution {
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int k) {
        // Write your code here
        Node curr=root;
        int count=0;
        int ans=-1;
        while(curr!=null){
            if(curr.left==null){
                count++;
                if(count==k)return curr.data;
                curr=curr.right;
            }else{
                Node leftSubtree=curr.left;
                while(leftSubtree.right!=null && leftSubtree.right!=curr){
                    leftSubtree=leftSubtree.right;
                }
                
                if(leftSubtree.right==null){
                    leftSubtree.right=curr;
                    curr=curr.left;
                }else{
                    leftSubtree.right=null;
                    count++;
                    if(count==k)return curr.data;
                    curr=curr.right;
                }
            }
        }
        return ans;
    }
}
