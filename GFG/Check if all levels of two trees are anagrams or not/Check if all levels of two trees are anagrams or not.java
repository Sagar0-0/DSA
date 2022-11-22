class Solution {
    public static boolean areAnagrams(Node node1, Node node2) {
        // code here
        Queue<Node> q1=new LinkedList<>();
        Queue<Node> q2=new LinkedList<>();
        q1.add(node1);
        q2.add(node2);
        while(!q1.isEmpty() && !q1.isEmpty()){
            int sz1=q1.size();
            int sz2=q2.size();
            if(sz1!=sz2)return false;
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<sz1;i++){
                Node a=q1.remove();
                Node b=q2.remove();
                map.merge(a.data,1,Integer::sum);
                map.merge(b.data,-1,Integer::sum);
                if(a.left!=null)q1.add(a.left);
                if(b.left!=null)q2.add(b.left);
                if(a.right!=null)q1.add(a.right);
                if(b.right!=null)q2.add(b.right);
                
            }
            
            for(int key:map.keySet()){
                if(map.get(key)!=0)return false;
            }
        }
        return true;
    }
}
