# Adventure in a Maze
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">You have got&nbsp;a maze, which is a n*n&nbsp;Grid. Every cell of the maze contains these numbers 1, 2 or 3.&nbsp;<br>
If it contains&nbsp;</span><span style="font-size:18px">1 :</span><span style="font-size:18px"> means we can go Right from that cell only.<br>
If it contains&nbsp;</span><span style="font-size:18px">2 :</span><span style="font-size:18px"> means we can go Down from that cell only.<br>
If it contains&nbsp;</span><span style="font-size:18px">3 :</span><span style="font-size:18px"> means we can go Right and Down to both paths from that cell.</span><br>
<span style="font-size:18px">We cant go out of the maze at any time.<br>
Initially, You are on the Top Left Corner of The maze(Entry). And, You need to go to the Bottom Right Corner of the Maze(Exit).<br>
You need to find the total number of paths from Entry to Exit Point.<br>
There may be many paths but you need to select that path which contains the maximum number of Adventure.<br>
The Adventure on a path is calculated by taking the sum of all the cell values thatlies</span><span style="font-size:18px"> in the path.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>matrix = {{1,1,3,2,1},{3,2,2,1,2},
{1,3,3,1,3},{1,2,3,1,2},{1,1,1,3,1}}
<strong>Output: </strong>{4,18}
<strong>Explanation: </strong>There are total 4 Paths Available 
out of which The Max Adventure is 18. Total 
possible Adventures are 18,17,17,16. Of these 
18 is the maximum.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>FindWays()&nbsp;</strong>which takes matrix as input parameter and returns a list containg total number of ways to reach at (n, n) modulo 10<sup>9</sup>&nbsp;+ 7 and maximum number of Adventure.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n<sup>2</sup>)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(n<sup>2</sup>)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n &lt;= 100&nbsp;</span></p>
 <p></p>
            </div>