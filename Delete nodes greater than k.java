class Solution
   {
         public Node deleteNode(Node root,int k)
         {
         //add code here.
         if(root==null)return null;
         if(root.data>=k){
             root.left=deleteNode(root.left,k);
             return root.left;
         }else{
             root.right=deleteNode(root.right,k);
             
         }
         return root;
         }
   }
