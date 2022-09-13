class Solution{
  public:
  
    void recur(Node *root,priority_queue<int>&pq)
  {
      if(!root)
      return;
      
      pq.push(root->data);
      recur(root->left,pq);
      recur(root->right,pq);

  }
  void change(Node *root,priority_queue<int>&pq)
  {
      if(!root or pq.empty())
      return;
      
      root->data=pq.top();
      pq.pop();
      change(root->right,pq);
      change(root->left,pq);
      
  }
    void convertToMaxHeapUtil(Node* root)
    {
        // Your code goes here
        priority_queue<int>pq;
        recur(root,pq);
        
        change(root,pq);
    }    
};
