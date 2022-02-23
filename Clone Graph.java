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
