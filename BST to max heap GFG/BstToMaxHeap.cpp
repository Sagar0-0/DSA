
  void helper1(Node *root,vector<int>&ans){
      if(root==NULL){
          return;
      }
      helper1(root->left,ans);
      ans.push_back(root->data);
      helper1(root->right,ans);
  }
  
  void helper2(Node *root,vector<int>&ans,int &index){
      if(root==NULL)return;
      helper2(root->left,ans,index);
      helper2(root->right,ans,index);
      root->data=ans[index];
      index++;
  
      
  }
    void convertToMaxHeapUtil(Node* root)
    {
        
        vector<int>ans;
        helper1(root,ans);
        int index=0;
        helper2(root,ans,index);
        
    }    
