# Partition a Linked List around a given value
## Medium 
<div class="problem-statement">
                <p></p><div><span style="font-size:18px">Given a linked list and a value x, partition it such that all nodes less than x come first, then all nodes with value equal to x and finally nodes with value greater than or equal to x. The original relative order of the nodes in each of the three partitions should be preserved. The partition must work in-place.</span></div>

<div>&nbsp;</div>

<div><strong><span style="font-size:18px">Example 1:</span></strong></div>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">1-&gt;4-&gt;3-&gt;2-&gt;5-&gt;2-&gt;3,
x = 3</span>
<strong><span style="font-size:18px">Output:</span></strong>
<span style="font-size:18px">1-&gt;2-&gt;2-&gt;3-&gt;3-&gt;4-&gt;5</span>
<strong><span style="font-size:18px">Explanation: </span></strong>
<span style="font-size:18px">Nodes with value less than 3 come first, </span>
<span style="font-size:18px">then equal to 3 and then greater than 3.</span>
</pre>

<div><strong><span style="font-size:18px">Example 2:</span></strong></div>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">1-&gt;4-&gt;2-&gt;10 </span>
<span style="font-size:18px">x = 3</span>
<strong><span style="font-size:18px">Output: </span></strong>
<span style="font-size:18px">1-&gt;2-&gt;4-&gt;10</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">Nodes with value less than 3 come first,</span>
<span style="font-size:18px">then equal to 3 and then greater than 3.</span>
</pre>

<div><strong><span style="font-size:18px">Your task:</span></strong></div>

<div><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>partition()</strong> which takes the head of the inked list and an integer x as input, and returns the head of the modified linked list after arranging the values according to x.</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Expected time complexity :</strong> O(n)</span></div>

<div><span style="font-size:18px"><strong>Expected Auxiliary Space:</strong> O(n)</span></div>

<div>&nbsp;</div>

<div><strong><span style="font-size:18px">Constraints:</span></strong></div>

<div><span style="font-size:18px">1 &lt;= N &lt;= 10<sup>5</sup></span></div>

<div><span style="font-size:18px">1 &lt;= k &lt;= 10<sup>5</sup></span></div>
 <p></p>
            </div>