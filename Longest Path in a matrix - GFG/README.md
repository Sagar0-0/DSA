# Longest Path in a matrix
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a n*m&nbsp;matrix, find the maximum length path (starting from any cell) such that all cells along the path are in strictly increasing order.</span></p>

<p><span style="font-size:18px">We can move in 4 directions from a given cell (i, j), i.e., we can move to (i+1, j) or (i, j+1) or (i-1, j) or (i, j-1).</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>matrix = {{1,2,9},{5,3,8},{4,6,7}}
<strong>Output: </strong>7
<strong>Explanation: </strong>The longest increasing path is
{1,2,3,6,7,8,9}.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>matrix = {{3,4,5},{3,2,6},{2,2,1}}
<strong>Output: </strong>4
<strong>Explanation: </strong>The longest increasing path is
{3,4,5,6}.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anyhting. Your task is to complete the function&nbsp;<strong>longestIncreasingPath()&nbsp;</strong>which takes matrix as input parameter and returns the length of the lonest increasing path.<br>
<br>
<strong>Expected Time Complexity:&nbsp;</strong>O(n*m)<br>
<strong>Expected Space Comeplxity:&nbsp;</strong>O(n*m)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n, m &lt;= 100<br>
1 &lt;= matrix[i][j] &lt;= 10<sup>4</sup></span></p>
 <p></p>
            </div>