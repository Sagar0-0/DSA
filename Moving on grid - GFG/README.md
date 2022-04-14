# Moving on grid
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a grid with dimensions r&nbsp;x c, the two&nbsp;players (say JON&nbsp;and ARYA&nbsp;) can move the coin over the grid satisfying the following rules:</span></p>

<ul>
	<li><span style="font-size:18px">There is a coin on (1,1) cell initially.</span></li>
	<li><span style="font-size:18px">JON&nbsp;will move first.</span></li>
	<li><span style="font-size:18px">Both will play on alternate moves.</span></li>
	<li><span style="font-size:18px">In each move they can place coin on following positions if current position of coin is x,y<br>
	(x+1,y), (x+2,y), (x+3,y), (x,y+1), (x,y+2), (x,y+3), (x,y+4), (x,y+5), (x,y+6)</span></li>
	<li><span style="font-size:18px">They can't go outside the grid.</span></li>
	<li><span style="font-size:18px">Player who cannot make any move will lose this game.</span></li>
	<li><span style="font-size:18px">Both play optimally.</span></li>
</ul>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: r = 1, c = 2
<strong>Output:</strong>&nbsp;JON&nbsp;
<strong>Explanation</strong>: ARYA lost the game because
he won't able to move after JON's move.  </span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>r = 2, c = 2
<strong>Output:&nbsp;</strong>ARYA
<strong>Explanation</strong>: After first move by JON(1,2 or 2,1)
and second move by ARYA(2,2) JON won't able to
move so ARYA wins.   </span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You dont need to read input or print anything. Complete the function <strong>movOnGrid()&nbsp;</strong>which takes r&nbsp;and c&nbsp;as input parameter and returns the name of the winner ( either JON&nbsp;or ARYA)</span><span style="font-size:18px">.<br>
<br>
<strong>Expected Time Complexity:</strong> O(1)<br>
<strong>Expected Auxiliary Space:</strong> O(1)<br>
<br>
<strong>Constraints:</strong><br>
1 &lt;= r, c&nbsp;&lt;=10<sup>5</sup></span></p>
 <p></p>
            </div>