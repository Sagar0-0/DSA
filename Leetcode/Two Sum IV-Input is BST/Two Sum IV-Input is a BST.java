Solution 1:
Without using set:

Approach:
1.Doing Inorder Traversal 
2.Storing data values in an arraylist
3.Applying two pointer algorithm and if target is found return true else return false
  
Code:

class Solution {
    
    public void fun(TreeNode root,ArrayList<Integer>aa){
        if(root==null){
            return ;
        }
        else{
            fun(root.left,aa);
            aa.add(root.val);
            fun(root.right,aa);
        }
    }
    public boolean findTarget(TreeNode root, int target) {
        ArrayList<Integer>aa=new ArrayList<Integer>();
        fun(root,aa);
        int start=0;
        int end=aa.size()-1;
        while(start<end){
            if(aa.get(start)+aa.get(end)==target){
                return true;
            }
            else if(aa.get(start)+aa.get(end)>target){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
    
  
  
  
Solution 2:
Using Set:
  
  
  Approach:
1.Doing Inorder Traversal 
2.While traversal if we get (target-root.val) in set we made flag as true else add the root.val in set.
3.return flag. If flag==true it means target is found else target sum is not present in the BST.
  
  class Solution {
   
    HashSet<Integer>set=new HashSet<Integer>();//global set
    boolean flag=false;//global variable
    
    
    public void fun(TreeNode root,int target){
        if(root==null){
            return;
        }
        if(set.contains(target-root.val)){
            flag=true;
        }
        else{
            set.add(root.val);
        }
        fun(root.left,target);
        fun(root.right,target);
    }
     public boolean findTarget(TreeNode root, int target) {
         fun(root,target);
         return flag;
     }
}

