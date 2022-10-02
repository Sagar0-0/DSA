# Geek in a Maze
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Geek is in a maze of size N * M. Each cell in the maze is made of either '.' or '#'. An empty cell is represented by '.' and an obstacle is represented by '#'. If Geek starts at cell (R, C), find how many different empty cells&nbsp;he can pass through while avoiding the obstacles. He can move in any of the four directions but he can move up at most U times and he can move down atmost D times. </span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
N = 3, M = 3
R = 1, C = 0
U = 1, D = 1
mat = {{'.', '.', '.'},
       {'.', '#', '.'},
       {'#', '.', '.'}}
<strong>Output:</strong> 5
<strong>Explanation:</strong> Geek can reach 
(1, 0), (0, 0), (0, 1), (0, 2), (1, 2) 

</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
N = 3, M = 4
R = 1, C = 0
U = 1, D = 2 
mat = {{'.', '.', '.'}, 
       {'.', '#', '.'}, 
       {'.', '.', '.'},
       {'#', '.', '.'}} 
<strong>Output:</strong> 10
<strong>Explanation:</strong> Geek can reach all the 
cells except for the obstacles.
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task: &nbsp;</strong><br>
You don't need to read input or print anything. Complete the function <strong>numberOfCells()&nbsp;</strong>which takes&nbsp;<strong>N, M, R, C, U, D</strong> and the&nbsp;two dimensional character array&nbsp;<strong>mat[][]</strong> as input parameters and returns the number of cells geek can visit( If he is standing on obstacle he can not move). </span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N*M ≤ 10<sup>6</sup><br>
mat[i][j] = '#" or '.'<br>
0 ≤ R ≤ N-1<br>
0 ≤ C ≤ M-1</span></p>
 <p></p>
            </div>