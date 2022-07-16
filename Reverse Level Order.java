/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
 import java.util.*;
public class Solution {
    public ArrayList<Integer> solve(TreeNode node) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<TreeNode> S = new Stack();
        Queue<TreeNode> Q = new LinkedList();
        Q.add(node);
  
        // Do something like normal level order traversal order.Following
        // are the differences with normal level order traversal
        // 1) Instead of printing a node, we push the node to stack
        // 2) Right subtree is visited before left subtree
        while (Q.isEmpty() == false)
        {
            /* Dequeue node and make it root */
            node = Q.peek();
            Q.remove();
            S.push(node);
  
            /* Enqueue right child */
            if (node.right != null)
                // NOTE: RIGHT CHILD IS ENQUEUED BEFORE LEFT
                Q.add(node.right);
                 
            /* Enqueue left child */
            if (node.left != null)
                Q.add(node.left);
        }
  
        // Now pop all items from stack one by one and print them
        while (S.empty() == false)
        {
            node = S.peek();
            System.out.print(node.val + " ");
            S.pop();
        }
            return list;
    }
}


