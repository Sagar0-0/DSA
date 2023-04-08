<h2><a href="https://leetcode.com/problems/jump-game/">1020. Number Of Enclaves</a></h2><h3>Medium</h3><hr><div>
<p> You are given an <code> m x n </code> binary matrix <code> grid </code>, where <code>0</code> represents a sea cell and <code> 1 </code>represents a land cell.

A move consists of walking from one land cell to another adjacent <strong> (4-directionally) </strong>land cell or walking off the boundary of the <code>grid</code>.

Return the number of land cells in <code> grid </code> for which we cannot walk off the boundary of the grid in any number of <strong> moves </strong>
</p>
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img src="https://assets.leetcode.com/uploads/2021/02/18/enclaves1.jpg"/>
<p>&nbsp;</p>
<pre>
<strong>Input: </strong> grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are three 1s that are enclosed by 0s, and one 1 that is not enclosed because its on the boundary.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img src="https://assets.leetcode.com/uploads/2021/02/18/enclaves2.jpg"/>
<p>&nbsp;</p>
<pre>
<strong>Input: </strong>grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
<strong>Output: </strong> 0
<strong>Explanation: </strong> All 1s are either on the boundary or can reach the boundary.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li><code>1 <= m,n <=500 </code> </li>
  <li> <code> grid[i][j] is either 0 or 1. </code> </li>
</ul>
</div>
