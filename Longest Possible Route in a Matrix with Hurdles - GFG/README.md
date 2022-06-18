# Longest Possible Route in a Matrix with Hurdles
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an N&nbsp;x M&nbsp;matrix, with a few hurdles(denoted by 0) arbitrarily placed, calculate the length of the longest possible route possible from source<strong>(xs,ys)</strong> to a destination<strong>(xd,yd)</strong> within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contain any diagonal moves and a location once visited in a particular path cannot be visited again.If it is impossible to reach the destination from the source return <strong>-1</strong>.</span></p>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">{xs,ys} = {0,0}</span>
<span style="font-size:18px">{xd,yd} = {1,8}</span>
<span style="font-size:18px">matrix = 1 1 1 1 1 1 1 1 1 1</span>
<span style="font-size:18px">         1 1 0 1 1 0 1 1 0 1</span>
<span style="font-size:18px">         1 1 1 1 1 1 1 1 1 1</span>
<strong><span style="font-size:18px">Output: </span></strong><span style="font-size:18px">24</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<strong><span style="font-size:18px"><img alt="" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/matrix_highlight.png" style="height:175px; width:500px" class="img-responsive"></span></strong></pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input: </span></strong>
<span style="font-size:18px">{xs,ys} = {0,3}</span>
<span style="font-size:18px">{xd,yd} = {2,2}</span>
<span style="font-size:18px">matrix =<strong><span style="font-size:18px"> </span></strong>1 0 0 1 0</span>
<span style="font-size:18px">         0 0 0 1 0</span>
<span style="font-size:18px">         0 1 1 0 0</span>
<strong><span style="font-size:18px">Output: </span></strong><span style="font-size:18px">-1</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">We can see that it is impossible to</span>
<span style="font-size:18px">reach the cell (2,2) from (0,3).</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>longestPath()&nbsp;</strong>which takes matrix ,source and destination as&nbsp;input parameters and returns an integer denoting the longest path.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(2^(N*M))<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N*M)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N,M &lt;= 10</span></p>
 <p></p>
            </div>