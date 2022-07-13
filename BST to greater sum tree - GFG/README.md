# BST to greater sum tree
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a BST, transform it into greater sum tree where each node contains sum of all nodes greater than that node.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
           2
         /    \
        1      6
              /  \
             3    7
<strong>Output:</strong> 18 16 13 7 0
<strong>Explanation:</strong>
Every node is replaced with the 
sum of nodes greater than itself. 
The resultant tree is:
               16
             /    \
           18       7
                  /   \
                 13    0
</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input</strong><strong>:</strong>
</span><span style="font-size:18px">          2
         /
        1</span>
<span style="font-size:18px"><strong>Output: </strong>2 0</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">The resultant tree is :</span>
<span style="font-size:18px">             0</span>
<span style="font-size:18px">            /</span>
<span style="font-size:18px">          2</span>
</pre>

<div><span style="font-size:18px"><strong>Your task :</strong></span></div>

<div><span style="font-size:18px">You don't have to read input or print anything. Your task is to complete the function <strong>transformTree() </strong>which takes the root of the tree as input and transforms the BST to a greater sum tree.</span></div>

<div><span style="font-size:18px"><strong>Note :</strong> The driver code prints the inorder traversal of the transformed BST.</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N), N = number of nodes</span></div>

<div><span style="font-size:18px"><strong>Expected Auxiliary Space: </strong>O(N), N = number of nodes</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Constraints :</strong></span></div>

<div><span style="font-size:18px">1 ≤ N ≤ 10<sup>4</sup></span></div>
 <p></p>
            </div>