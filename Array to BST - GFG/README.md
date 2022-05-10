# Array to BST
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a sorted array. Convert it into a Height balanced&nbsp;Binary Search Tree (BST). Find the preorder traversal of height balanced BST. If there exist many such balanced BST consider the tree whose preorder is lexicographically smallest.<br>
Height balanced BST means a binary tree in which the depth of the left subtree and the right subtree&nbsp;of every node never differ by more than 1.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> nums = {1, 2, 3, 4}
<strong>Output:</strong> {2, 1, 3, 4}
<strong>Explanation:</strong> 
The preorder traversal of the following 
BST formed is {2, 1, 3, 4}:
</span><span style="font-size:18px">&nbsp;          2
</span><span style="font-size:18px">&nbsp;        /   \
</span>           <span style="font-size:18px">1     3
</span><span style="font-size:18px">&nbsp;              \
&nbsp;               4</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>nums = {1,2,3,4,5,6,7}
<strong>Ouput: </strong>{4,2,1,3,6,5,7}
<strong>Explanation: 
</strong>The preorder traversal of the following
BST formed is {4,2,1,3,6,5,7} :
        4
       / \
      2   6
     / \  / \
    1   3 5  7</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>sortedArrayToBST()&nbsp;</strong>which takes the sorted array <strong>nums</strong> as input paramater and returns the preorder traversal of height balanced BST. If there exist many such balanced BST consider the tree whose preorder is lexicographically smallest.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(n)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(n)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ |nums| ≤&nbsp;10<sup>4</sup><br>
-10<sup>4</sup>&nbsp;≤&nbsp;nums[i] ≤&nbsp;10<sup>4</sup></span><br>
&nbsp;</p>
 <p></p>
            </div>