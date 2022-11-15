// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the curr node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            System.out.println(T.largestBst(root));
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    static int ans;
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root){
        if(root==null)return 0;
        ans=0;
        checkBST(root);
        return ans;
    }
    static boolean checkBST(Node root){
        if(root==null)return true;
        boolean isLeftBST=checkBST(root.left);
        boolean isRightBST=checkBST(root.right);
        boolean isLeftSmaller=true;
        boolean isRightLarger=true;
        if(root.left!=null && isLeftBST){
            if(getMAX(root.left)>=root.data)isLeftSmaller=false;
        }
        if(root.right!=null && isRightBST){
            if(getMIN(root.right)<=root.data)isRightLarger=false;
        }
        boolean isBST=isLeftSmaller && isRightLarger && isLeftBST && isRightBST;
        if(isBST){
            ans=Math.max(ans,count(root));
        }
        return isBST;
    }
    static int count(Node root){
        if(root==null)return 0;
        return 1+count(root.left)+count(root.right);
    }
    static int getMIN(Node root){
        if(root.left==null)return root.data;
        return getMIN(root.left);
    }
    static int getMAX(Node root){
        if(root.right==null)return root.data;
        return getMAX(root.right);
    }
    
}