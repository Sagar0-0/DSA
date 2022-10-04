/*
  This code is contributed by-->
  - Abhishek Kumar (https://github.com/Abhi2061)
  - Adarsh Urmaliya (https://github.com/Satellite-system)
*/

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


// Another Approach :: 

// We can use Vector, and store the char as 'L' when we move to left of node in 'R' when me move to right of node, in a common vector, 
// when we got to find first number, we then store all that data to vector named First, similarily for second number we save to vector named Second,
// now in main function we would traverse through, First and Second vector so as to remove common char stored for common Nodes, then after the common 
// nodes have been filtered, we travese in both vectors separately so as to count number of points when char has been changed from the previous char, as that
// would mean a turn from LEFT to RIGHT or from RIGHT to LEFT, also just after removing the common nodes we would check if we have traversed any vector completely, 
// that would mean that one of the node is ancestor to other, in that case we would not increment an extra for a turn at an ancestor node..
  
//   MY code : 

class Solution{
  public:
void traverseHelper(Node* root, int first, int second, vector<char> &FirstSeries, 
            vector<char> &SecondSeries, vector<char> &cmn, int num){
    if(!root || num ==2) return;
    if(root->data==first){
        num++;
        FirstSeries = cmn;
    }
    if(root->data==second){
        num++;
        SecondSeries = cmn;
    }
    
    cmn.push_back('L');
    traverseHelper(root->left, first, second, FirstSeries, SecondSeries, cmn, num);
    cmn.pop_back();
    
    if(num==2) return;
    
    cmn.push_back('R');
    traverseHelper(root->right, first, second, FirstSeries, SecondSeries, cmn, num);
    cmn.pop_back();
}  
    // function should return the number of turns required to go from first node to second node 
    int NumberOFTurns(struct Node* root, int first, int second)
    {
        vector<char> FirstSeries, SecondSeries, cmn;
        traverseHelper(root, first, second, FirstSeries, SecondSeries, cmn, 0);
        
        int i=0;
        for(; i< min(FirstSeries.size(), SecondSeries.size()); i++){
            if(FirstSeries[i] != SecondSeries[i]) break;
        }
        
        int cnt = 0;
        if(i == FirstSeries.size() && i == SecondSeries.size()) return cnt;
      
        // For the case of Different Ancestors
        if(i<FirstSeries.size() && i<SecondSeries.size()) cnt++;
        
        // cout<<"1-Series----------------\n";
        for(int j=i+1; j<FirstSeries.size(); j++){
            // cout<<FirstSeries[j]<<" ";
            if(FirstSeries[j]!=FirstSeries[j-1]){
                cnt++;}
        }
        
        // cout<<"2-Series----------------\n";
        for(int j=i+1; j<SecondSeries.size(); j++){
            if(SecondSeries[j]!=SecondSeries[j-1]){
                cnt++;
            }
        }
        
        return cnt;
    }
};
