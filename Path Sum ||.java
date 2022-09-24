class Solution {
    
    public static void fun(TreeNode root,int target,String s,List<List<Integer>>list){
        if(root==null){
            return ;
        }
        else if(root.left==null && root.right==null){
            s=s+root.val;
            s=s+"_";
            String arr[]=s.split("_");
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+Integer.valueOf(arr[i]);
            }
            if(sum==target){
                ArrayList<Integer>aa=new ArrayList<Integer>();
                for(int i=0;i<arr.length;i++){
                    aa.add(Integer.valueOf(arr[i]));
                }
                list.add((aa));
            }
        }
        else{
            fun(root.left,target,s+root.val+"_",list);
            fun(root.right,target,s+root.val+"_",list);
        }
    }
   
     public List<List<Integer>> pathSum(TreeNode root, int target) {
          List<List<Integer>>list=new ArrayList<List<Integer>>();
         if(root==null){
             return list;
         }
         else{
            
             String s="";
             fun(root,target,s,list);
             return list;
         }
     }
}
