void inorder(Node* node,int &k,int &sum)
{
    if(node==NULL)
        return ;
    //if(k==0)
       //return;
   inorder(node->left,k,sum);
   if(k==0)
       return;
   sum+=node->data;
   k--;
   inorder(node->right,k,sum);
}

int sum(Node* root, int k) 
{ 
  
    // Your code here
    int sum=0;
    inorder(root,k,sum);
    return sum;
    
} 
