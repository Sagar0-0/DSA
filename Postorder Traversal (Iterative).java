class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        Map<Node,Boolean> map=new HashMap<>();
        Deque<Node> s=new ArrayDeque<>();
        ArrayList<Integer> ans=new ArrayList<>();
        if(node!=null){
            s.push(node);
            map.put(node,true);
        }
        if(node.right!=null){
            s.push(node.right);
            map.put(node.right,false);
        }
        if(node.left!=null){
            s.push(node.left);
            map.put(node.left,false);
        }
        while(!s.isEmpty()){
            Node cur=s.pop();
            if(map.get(cur)){
                ans.add(cur.data);
            }else{
                s.push(cur);
                if(cur.right!=null){
                    s.push(cur.right);
                    map.put(cur.right,false);
                }
                if(cur.left!=null){
                    s.push(cur.left);
                    map.put(cur.left,false);
                }
                map.put(cur,true);
            }
        }
        return ans;
        
    }
}
