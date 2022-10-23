class Solution
{
    
    int height(Node *node)
    {
        if(node == nullptr) return 0;
        
        int left = height(node -> left);
        int right = height(node -> right);
        
        return max(left,right)+1;
        
    }
    
    void printGivenLevel(Node *node,int level,vector<int> &ans)
    {
        if(node == nullptr) return;
        
        if(level == 0) ans.push_back(node -> data);
        else if(level > 0)
        {
            printGivenLevel(node -> left,level - 1,ans);
            printGivenLevel(node -> right,level - 1,ans);
        }
        return;
    }
    
    
    public:
    //Function to return the level order traversal of a tree.
    vector<int> levelOrder(Node* node)
    {
        vector<int> ans;
        int h = height(node);
        for(int i = 0 ; i< h;i++)
        {
            printGivenLevel(node,i,ans);
        }
        return ans;
    }
};
