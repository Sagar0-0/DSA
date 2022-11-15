# Find all possible paths from top to bottom
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a N x M grid. Find All possible paths from top left to bottom right.F<em>rom each cell you can either move only to right or down</em>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong></span><span style="font-size:18px">1 2 3</span>
<span style="font-size:18px">       4 5 6</span>
<span style="font-size:18px"><strong>Output: </strong></span><span style="font-size:18px">1 4 5 6</span>
<span style="font-size:18px">        1 2 5 6 </span>
<span style="font-size:18px">        1 2 3 6</span>
<span style="font-size:18px"><strong>Explanation: </strong>We can see that there are 3 </span>
<span style="font-size:18px">paths from the cell (0,0) to (1,2).</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong></span><span style="font-size:18px">1 2</span>
<span style="font-size:18px">       3 4</span>
<span style="font-size:18px"><strong>Output: </strong></span><span style="font-size:18px">1 2 4</span>
<span style="font-size:18px">        1 3 4</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>findAllPossiblePaths()&nbsp;</strong>which takes&nbsp;two integers n,m and grid[][]&nbsp;&nbsp;as input parameters and returns all possible paths from the top left cell to bottom right cell&nbsp;in a 2d array.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(2^N*M)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n,m &lt;= 10<sup>&nbsp;</sup><br>
1 &lt;= grid[i][j] &lt;= n*m<br>
n * m &lt;&nbsp;20</span><br>
&nbsp;</p>
 <p></p>
            </div>