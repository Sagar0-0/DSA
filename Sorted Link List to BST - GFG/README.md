# Sorted Link List to BST
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a Singly Linked List which has data members sorted in ascending order. Construct a&nbsp;Balanced Binary Search Tree&nbsp;which has same data members as the given Linked List.<br>
<strong>Note: </strong>There might be nodes with same value.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
Linked List: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;7
<strong>Output:</strong>
4 2 1 3 6 5 7
<strong>Explanation :</strong>
The BST formed using elements of the 
linked list is,
        4
      /   \
     2     6
   /  \   / \
  1   3  5   7  
Hence, preorder traversal of this 
tree is 4 2 1 3 6 5 7
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
Linked List : 1-&gt;2-&gt;3-&gt;4
<strong>Ouput:</strong>
3 2 1 4
<strong>Exaplanation:</strong>
The BST formed using elements of the 
linked list is,
      3   
    /  \  
   2    4 
 / 
1
Hence, the preorder traversal of this 
tree is 3 2 1 4
</span></pre>

<div><span style="font-size:18px"><strong>Your task :</strong></span></div>

<div><span style="font-size:18px">You don't have to read input or print anything. Your task is to complete the function <strong>sortedListToBST()</strong>, which takes <strong>head</strong> of the linked list as an input parameter and returns the root of the BST created.</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N), N = number of Nodes<br>
<strong>Expected Auxiliary Space:</strong> O(N), N = number of Nodes</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Constraints</strong>:</span></div>

<div><span style="font-size:18px">1 ≤ Number of Nodes ≤ 10<sup>6</sup></span></div>

<div><span style="font-size:18px">1 ≤ Value of each node ≤ 10<sup>6</sup></span></div>
 <p></p>
            </div>