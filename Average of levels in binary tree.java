class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode curr=que.poll();
                sum+=curr.val;
                if(curr.left!=null) que.add(curr.left);
                if(curr.right!=null) que.add(curr.right);
            }
            result.add(sum/size);
            
        } 
        return result;
        
    }
}
