Node * bToDLL(Node *root)
    {
        // your code here
        // TC: O(1) using morris inorder traversal
        
        Node* curr = root, *head = NULL;
        
        while(curr != NULL){
            if(curr->left != NULL){
                Node* traversal = curr->left;
                while(traversal->right != NULL && traversal->right != curr)
                    traversal = traversal->right;
                
                if(traversal->right == NULL){
                    traversal->right = curr;
                    
                    Node *tmp = curr->left;
                    curr->left = traversal;
                    curr=tmp;
                    continue;
                }
            }    
            if(head == NULL) head = curr;
            //cout<<curr->right->data<<endl;
            
            Node *traversal = curr->right;
            if(traversal != NULL && traversal->left != curr){
                while(traversal->left != NULL)
                    traversal = traversal->left;
                
                Node* tmp = curr->right;
                traversal->left = curr;
                curr->right = traversal;
                curr = tmp;
            }
            else curr = curr->right;
                
            
        }
        return head;
    }