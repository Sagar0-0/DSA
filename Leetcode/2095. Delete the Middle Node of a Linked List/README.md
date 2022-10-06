<h2><a href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/">2095. Delete the Middle Node of a Linked List</a></h2><h3>Medium</h3><hr><div><p>You are given the <code>head</code> of the Linked List. Delete the middle node and return the <code>head</code>of the modified linked list. The middle node of the list of size <code>n</code> is the <code>[n/2]th</code>node from the start using 0-based indexing, where <code>[x]</code>denotes the largest integer less than or equal to <code>x</code>
 
 <p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/11/16/eg1drawio.png" style="height: 150px; width: 650px;">
<pre><strong>Input:</strong> tops = [2,1,2,4,2,2]
<strong>Output:</strong> [1,3,4,1,2,6]
<strong>Explanation:</strong> 
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node. 
</pre>

 
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>The number of nodes in the list is in the range [1, 10]<sup>5</sup></code></li>
 <li><code>1 &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
</ul>
</div>
