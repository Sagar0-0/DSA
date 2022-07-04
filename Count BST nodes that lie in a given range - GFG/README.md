# Count BST nodes that lie in a given range
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a Binary Search Tree (BST) and a range <strong>l-h(inclusive)</strong>, count the number of nodes in the BST that lie in the given range. </span></p>

<ul>
	<li><span style="font-size:18px">The values smaller than root go to the left side</span></li>
	<li><span style="font-size:18px">The values greater and equal to the root go to the right side</span></li>
</ul>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>      10
&nbsp;    /  \
&nbsp;   5    50
&nbsp;  /    /  \
&nbsp; 1    40  100
l = 5, h = 45
<strong>Output: </strong>3<strong>
Explanation: </strong>5 10 40 are the node in the
range</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
     5
&nbsp;   /  \
&nbsp;  4    6
&nbsp; /      \
&nbsp;3        7
l = 2, h = 8
<strong>Output: </strong>5<strong>
Explanation: </strong>All the nodes are in the
given range.</span>
</pre>

<p><strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">This is a function problem. You don't have to take input. You are required to complete the function&nbsp;<strong>getCountOfNode()&nbsp;</strong>that takes root, l ,h as parameters and returns the <strong>count</strong>.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(Height of the BST).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Number of nodes &lt;= 100<br>
1 &lt;= l &lt; h &lt; 10<sup>3</sup></span></p>
 <p></p>
            </div>