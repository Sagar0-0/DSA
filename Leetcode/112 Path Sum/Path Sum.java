Solution 1:
Using ArrayList

class Solution {
    public static void fun(TreeNode root, int sum , int val, ArrayList<Integer>aa){
        if(root==null){
            return ;
        }
        else if(root.left==null && root.right==null){
            val=val+root.val;
            aa.add(val);
            return ;
        }
        else{
            fun(root.left,sum,val+root.val,aa);
            fun(root.right,sum,val+root.val,aa);
        }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        else{
            ArrayList<Integer>aa=new ArrayList<Integer>();
            fun(root,sum,0,aa);
           // System.out.println(aa);
            if(aa.contains(sum)){
                return true;
            }
            return false;
        }
    }
}

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


Solution 2:
Without Using ArrayList

class Solution {
    boolean status=false;
    public void fun(TreeNode root, int sum,int s, boolean status){
        if(root==null){
            return;
        }
        else if(root.left==null && root.right==null){
           s=s+root.val;
            if(s==sum){
                this.status=true;
            }
        }
        else{
            fun(root.left,sum,s+root.val,status);
            fun(root.right,sum,s+root.val,status);
        }
    }
   
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        else{
            
            fun(root,sum,0,status);
            if(status==true){
                return true;
            }
            return false;
        }
    }
}
