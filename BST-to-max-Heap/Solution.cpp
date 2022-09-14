class Solution{

  public:

  Node* helper(Node* root){

       if(!root)return NULL;

         Node* left=helper(root->left);

         Node* right=helper(root->right);

         if(!left&&!right)return root;

         if(!left&&right){

            if(right->data>root->data){swap(root->data,right->data);helper(root->right);}  

         }

         else if(left&&!right){

             if(left->data>root->data){swap(root->data,left->data); helper( root->left);}

         }

         else{

         if(left->data>root->data){swap(root->data,left->data); helper( root->left);}

         if(right->data>root->data){swap(root->data,right->data);helper(root->right);}

         }

        return root;

  }

    void convertToMaxHeapUtil(Node* root)

    {

        helper(root);

    }    

};