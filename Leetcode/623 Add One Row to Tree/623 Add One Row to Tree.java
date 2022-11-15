class Solution {
    
    public TreeNode add(TreeNode root, int val, int depth, int currdepth){
        if(root==null) return root;
        
        if(depth==1){
            TreeNode temp = new TreeNode(val);
            // if(side=='l')
            temp.left = root;
            
            
            return temp;
        }
        else if(currdepth==depth-1){
            TreeNode temp1 = new TreeNode(val);
            TreeNode temp2 = new TreeNode(val);
            
            
            temp1.right = root.right;
            temp2.left = root.left;
            
            
            root.left = temp2;
            root.right = temp1;
            return root;
        }else{
            root.left = add(root.left,val,depth,currdepth+1);
            root.right = add(root.right,val,depth,currdepth+1); 
            return root;
        }
        
        
        
        
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth==1){
            TreeNode temp = new TreeNode(val);
            temp.left = root;
            
            return temp;
        }
        return add(root,val,depth,1);
        
    }
}
