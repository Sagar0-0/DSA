void inorder(Node* node,vector<int> &ans)
{
    if(node==NULL)
        return ;
   inorder(node->left,ans);
   ans.push_back(node->data);
   inorder(node->right,ans);
}

int sum(Node* root, int k) 
{ 
  
    // Your code here
    int sum=0;
    vector<int> ans;
    inorder(root,ans);
    int cnt=0;
    for(int i=0;i <ans.size();i++)
    {
        if(cnt==k)
           break;
        else   
           sum+=ans[i];
        cnt++;
    }
    return sum;
    
} 

