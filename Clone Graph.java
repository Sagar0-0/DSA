class Solution {
    Map<Node, Node> map = new HashMap<>(); 
    public Node cloneGraph(Node node) {
        if (node == null) return node;
        if(map.containsKey(node)) return map.get(node); 
        Node clonedGraph = new Node(node.val, new ArrayList<>()); 
        map.put(node, clonedGraph); 
        for(Node oldNeb : node.neighbors) {
                Node clonedNeb = cloneGraph(oldNeb);  
                clonedGraph.neighbors.add(clonedNeb);
        }
        return map.get(node); 
    }
}

//================================================================================

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        
        Map<Node,Node> map = new HashMap();
        Queue<Node> queue = new LinkedList();
        
        queue.add(node);
        map.put(node,new Node(node.val));
        
        while(!queue.isEmpty()){
            
            Node curr = queue.poll();
            
            for(Node neighbor : curr.neighbors){
                if(!map.containsKey(neighbor)){
                    map.put(neighbor,new Node(neighbor.val));
                    queue.add(neighbor);
                }
                map.get(curr).neighbors.add(map.get(neighbor));
            }
        }
        
        return map.get(node);
    }
}
