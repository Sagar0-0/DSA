# Broken blocks
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">In the game of Broken Blocks, the player is allowed to move on <strong>m x n</strong>&nbsp;blocks i.e. <strong>m&nbsp;</strong>levels and <strong>n&nbsp;</strong>stone blocks on each level such that one level is vertically above the previous level (as in a staircase), with some of its stone blocks replaced by wooden blocks.<br>
The player at the start of the game is present on the ground level (which should&nbsp;be considered as level 0 or it can be considered as level -1). The player can start from <strong>any</strong> of the blocks present on the <strong>level 0</strong> and start moving further to next levels. The player can only move to the stone-block just above to the present stone-block or diagonally to the left or to the right. The player cant move on the same level.<br>
If the player steps on any of the wooden block (denoted by <strong>-1</strong>), he will fall off the board and die as the wood-block will not able to hold players weight. Each of the stone-block has some gold coins present on it (wooden blocks doesnt have any coins on them). If at any point the player cant move to further level due to any reason, the game ends and his present total coin score will be considered.<br>
The players aim is to collect as many gold coins as he can without falling off the board.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>matrix = {{2,5,6},{-1,3,2},{4,-1,5}}
<strong>Output: </strong>14
<strong>Explanation: </strong>Assume 0-based indexing.The matrix 
is:
2 5 6 (level 0)
-1 3 2 (level 1)
4 -1 5 (lever 2)
The player can collect maximum number of coins 
by moving through:matrix[0][2] + matrix[1][1] 
+ matrix[2][2] = 6 + 3 + 5 = 14 coins.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>matrix = {{-1,2,3,4},{5,-1,-1,2},
{4,3,-1,-1}}
<strong>Output: </strong>11
<strong>Explanation: </strong></span><span style="font-size:18px">The matrix is:
-1 2 3 4(level 0)
5 -1 -1 2(level 1)
4 3 -1 1(level 2)
The player can collect maximum number of coins 
by moving through:a[0][1] + a[1][0] + a[2][0] 
= 2 + 5 + 4 = 11 coins.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>MaxGold()&nbsp;</strong>which takes matrix as input parameter and returns the maximum number of gold coins.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n*m)</span><br>
<span style="font-size:18px"><strong>Expected Space Complexity:</strong>&nbsp;O(1)</span></p>
 <p></p>
            </div>