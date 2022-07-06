# Brain Game
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">2 players A and&nbsp;B take&nbsp;turns alternatively to play a game in which they have N numbers on a paper. In one turn, a player can replace one of the numbers by any of its factor (except for 1 &amp; the number itself).&nbsp;The player who is unable to make a move looses the game. Find the winner of the game if A starts the game and both play optimally.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>nums = [5, 7, 3]
<strong>Output: </strong>B
<strong>Explanation: </strong>Since all the numbers are prime,
</span><span style="font-size:18px">so A will not be able to make the first move. </span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>nums = [2, 4, 7, 11]
<strong>Outptut: </strong>A
<strong>Explanation: </strong>In the first move A will replace 4
by 2, so the numbers will become [2, 2, 7, 11]
now B will not be able to make a move since all 
the remaining numbers can only be divided by 1 
or the number itself.  </span>

</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>brainGame()&nbsp;</strong>which takes the list of numbers as input parameter and returns true if&nbsp;A wins and false if B wins.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N<sup>2</sup>)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(N)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints</strong><br>
1 &lt;= N &lt;= 1000<br>
1 &lt;= nums[i] &lt;= 1000</span></p>
 <p></p>
            </div>