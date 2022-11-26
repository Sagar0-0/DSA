class Solution{
    
    int ind = 0;
    Node* solve(string str)
    {
        if(str.length() == 0 || ind >= str.length())
           return NULL;
          
        //calculate num
        int num = 0;
        while(ind < str.length() && str[ind] != '(' && str[ind] != ')')
        {
            int val = (int)(str[ind]-'0');
            num = num*10 + val;
            ind++;
        }
        
        //create new root
        Node* root = NULL;
        if(num > 0)
          root = new Node(num);
        
       //for left child
       if(ind < str.length() && str[ind] == '(')
       {
           ind++;
           root->left = solve(str);
       }
        
       if(ind < str.length() && str[ind] == ')')
       {
           ind++;
           return root;
       }
       
       //for right child
       if(ind < str.length() && str[ind] == '(')
       {
           ind++;
           root->right = solve(str);
       }
        
       if(ind < str.length() && str[ind] == ')')
       {
           ind++;
           
       }
        return root;  
        
    }
    
public:
    // function to construct tree from string
    Node *treeFromString(string str){
      
        if(str.length() == 0) return NULL;
        
         return solve(str);
          
    }
};
