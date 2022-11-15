# Sum of nodes within k distance from target
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px"><strong>Note: This&nbsp;<a href="http://practice.geeksforgeeks.org/problem-of-the-day" target="_blank">POTD</a>&nbsp;is a part of&nbsp;<a href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=potd&amp;utm_medium=problempage&amp;utm_campaign=gsc22" target="_blank">Geek Summer Carnival</a>. Solve all POTD consecutively from 5th to 10th April and get a chance to win exclusive discount vouchers on our GfG courses.</strong></span></p>

<hr>
<p><span style="font-size:18px">Geek is at the geek summer carnival. To unlock discounts on exclusive courses he is given a card with a binary tree, a target node and a positive integer k on it.&nbsp;<br>
He needs to find the sum of all nodes within a max distance k from target node such that the target node is included in sum.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">target = 9 
k = 1
Binary Tree = 
            1
           /  \
          2    9
        /     /  \
       4     5    7
      /  \       /  \
     8    19    20   11
    /   /   \
  30   40   50
</span>
<span style="font-size:18px"><strong>Output: </strong>22</span>

<span style="font-size:18px"><strong>Explanation: </strong>
Nodes within distance 1 from 9 
9 + 5 + 7 + 1 = 22</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">target = 40 
k = 2
Binary Tree = 
            1
           /  \
          2    9
        /     /  \
       4     5    7
      /  \       /  \
     8    19    20   11
    /   /   \
  30   40   50</span>
<span style="font-size:18px">
<strong>Output: </strong>113</span>

<span style="font-size:18px"><strong>Explanation:</strong>
Nodes within distance 2 from 40,
40 + 19 + 50 + 4 = 113
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Complete the function <strong>sum_at_distK()</strong> that takes the root of the given binary tree, target and k as input parameters and return the required sum.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected time complexity:</strong> O(n)<br>
<strong>Expected space complexity: </strong>O(n)</span><br>
<br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= number of nodes &lt;= 1000<br>
1 &lt;= data in nodes,target &lt;= 10000<br>
1 &lt;= k &lt;= 20</span></p>
 <p></p>
            </div>