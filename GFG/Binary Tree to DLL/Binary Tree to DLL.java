class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	    Node[] arr=dfs(root);
	    return arr[0];
    }
    Node[] dfs(Node root){
        if(root.left==null && root.right==null){
            return new Node[]{root,root};
        }
        
        if(root.left==null){
            Node[] righty=dfs(root.right);
            root.right=righty[0];// 10 -> 36
            righty[0].left=root;// 10 <- 36
            return new Node[]{root,righty[1]};//10,15
        }
        
        Node[] lefty=dfs(root.left);
        lefty[1].right=root;//30 -> 10
        root.left=lefty[1];// 30 <-10
        
        if(root.right==null){
            return new Node[]{lefty[0],root};//25,10
        }
        Node[] righty=dfs(root.right);
        root.right=righty[0];// 10 -> 36
        righty[0].left=root;// 10 <- 36
        
        return new Node[]{lefty[0],righty[1]};//25,15
    }
}



Approach 2: 

Solution Explain:

    1. make an arraylist
    2. put all the elements of the tree in inorder fashion
    3. now traverse that arraylist and construct left as prev and right as arraylist next element
    4. Time complexity= o(N)(inorder and traversal of arraylist) and space = O(N) bez of arraylist


 class Solution
{
    Node bToDLL(Node root)
    {
        if(root==null || root.left==null && root.right==null){
            return root;
        }


	    //make ArrayList
	    ArrayList<Node> al=new ArrayList<>();

	    //put all the element's in inorder to al
	    inorder(root,al);

	    Node dummy=al.get(0);


	    //take two nodes prev and curr for doubly linked list
	    Node prev=null;
	    Node curr=null;

	    //counter for traversing arraylist
	    int i=0;


	    //create doubly linked list
	    while(i<al.size()){

	        curr=al.get(i);
	        curr.left=prev;

	        if(i+1<al.size())
	            curr.right=al.get(i+1);
	        else
	            curr.right=null;

	        prev=curr;
	        i++;

	    }

	    return dummy;
    }

    public void inorder(Node root,ArrayList<Node> al){

        if(root==null)
            return;

        inorder(root.left,al);
        al.add(root);
        inorder(root.right,al);
    }
}

Contributed by @Jay-Thesia
