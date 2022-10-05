
//This Approch uses Recursuion 

class Solution
{
    public:
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    void inorder1(Node* root, vector<int> &v1){
        if(root){
            inorder1(root->left,v1);
            v1.push_back(root->data);
            inorder1(root->right,v1);
        }
    }
  
  //calling Inorder
    void inorder2(Node* root, vector<int> &v1){
        if(root){
            inorder2(root->left,v1);
            v1.push_back(root->data);
            inorder2(root->right,v1);
        }
    }
    vector<int> merge(Node *root1, Node *root2)
    {
       vector<int> v1;
       inorder1(root1,v1);//we are calling this inorder to add all the element in the main vector so that at the end we get a sorted array by merging both element in the main vector
       inorder2(root2,v1);
       sort(v1.begin(),v1.end());
       return v1;
    }
};
