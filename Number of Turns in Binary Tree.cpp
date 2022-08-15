class Solution{
  public:
  
    // function should return the number of turns required to go from first node to second node 
    int NumberOFTurns(struct Node* root, int first, int second)
    {
      // Your code goes here
      Node *head = lca(root, first, second);
      
      int F = countTurns(head, first, ' ');
      int S = countTurns(head, second, ' ');
      
      int ans = F + S;
      
      if(head->data != first and head->data != second)
      ans++;
      
      return ans;
    }
    
    //Function to return the lowest common ancestor in a Binary Tree.
    Node* lca(Node* root ,int n1 ,int n2 )
    {
       //Your code here 
       
        if(!root)
        return root;
        
        if(root->data == n1 or root->data == n2)
        return root;
        
        Node *Left = lca(root->left, n1, n2);
        Node *Right = lca(root->right, n1, n2);
        
        if(Left and !Right)
        return Left;
        
        else if(!Left and Right)
        return Right;
        
        else if(Left and Right)
        return root;
        
        else
        return nullptr;
    }
    
    // function should return the minimum number of turn to reach a node.
    int countTurns(Node* root, int n, char d)
    {
        if(!root)
        return 1e5;
        
        if(root->data == n)
        return 0;
        
        int Left = countTurns(root->left, n, 'L');
        int Right = countTurns(root->right, n, 'R');
        
        if(d == 'L')
        Right++;
        if(d == 'R')
        Left++;
        
        return min(Left, Right);
    }
};
