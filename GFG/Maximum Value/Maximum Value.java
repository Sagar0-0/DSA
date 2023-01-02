class Solution {
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       Queue<Node> q=new LinkedList<>();
       ArrayList<Integer> ans=new ArrayList<>();
       q.add(node);
       while(!q.isEmpty()){
           int currLevelSize = q.size();
           int max=0;
           while(currLevelSize-->0){
               Node curr=q.remove();
               max=Math.max(max,curr.data);
               if(curr.left!=null)q.add(curr.left);
               if(curr.right!=null)q.add(curr.right);
           }
           ans.add(max);
       }
       return ans;
    }
}
