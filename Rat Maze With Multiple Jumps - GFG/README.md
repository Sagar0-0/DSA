# Rat Maze With Multiple Jumps
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">A Maze is given as <strong>n*n</strong>&nbsp;matrix of blocks where source block is the upper left most block i.e., <strong>matrix[0][0]</strong> and destination block is lower rightmost block i.e., <strong>matrix[n-1][n-1]</strong>. A rat starts from source and has to reach the destination. The rat can move in only two directions: first forward if possible or down. If multiple solutions exist, the shortest earliest hop will be accepted. For the same hop distance at any point, forward will be preferred over downward. In the maze matrix, 0 means the block is the dead end and non-zero number means the block can be used in the path from source to destination. The non-zero value of mat[i][j] indicates number of maximum jumps rat can make from cell mat[i][j]. In this variation, Rat is allowed to jump multiple steps at a time instead of 1. Find a matrix which describes the position the rat to reach at the destination.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>{{2,1,0,0},{3,0,0,1},{0,1,0,1},
{0,0,0,1}}
<strong>Output: </strong>{{1,0,0,0},{1,0,0,1},{0,0,0,1},
{0,0,0,1}}
<strong>Explanation: </strong>Rat started with matrix[0][0] and 
can jump up to 2 steps right/down. First check 
matrix[0][1] as it is 1, next check 
matrix[0][2] ,this won't lead to the solution. 
Then check matrix[1][0], as this is 3(non-zero)
,so we can make 3 jumps to reach matrix[1][3]. 
From matrix[1][3] we can move downwards taking 
1 jump each time to reach destination at 
matrix[3][3].</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>{{2,1,0,0},{2,0,0,1},{0,1,0,1},
{0,0,0,1}}
<strong>Output:</strong> {{-1}}
<strong>Explanation: </strong>As no path exists so, -1.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anyhting, Your task is to complete the function&nbsp;<strong>ShortestDistance()&nbsp;</strong>which takes the matrix as input parameter and returns a matrix of size n if path exists otherwise returns a matrix of 1x1 which contains -1. In output matrix, 1&nbsp;at (i, j) represents the cell is taken into the path otherwise 0 if any path exists.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n*n*k) where k is max(matrix[i][j])<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(1)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n &lt;= 50<br>
1 &lt;= matrix[i][j] &lt;= 20</span></p>
 <p></p>
            </div>