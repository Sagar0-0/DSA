class Solution
{
    static int i=0;
    public static void convertToMaxHeapUtil(Node root)
    {
        //code here
        ArrayList<Integer> nodes=new ArrayList<>();
        i=0;
        inOrder(root, nodes);
    }
    
    public static void inOrder(Node root, ArrayList<Integer> nodes) {
        if(root==null) return ;
        
        inOrder(root.left, nodes);
        nodes.add(root.data);  //adding data to ArrayList stores in Ascending order
        inOrder(root.right, nodes);
         root.data=nodes.get(i++);  //Modifying root value in postOrder Traversal, so that All Left and Right Nodes store lesser value compared to root as ArrayList stores in Ascending Order
    }
   
}
