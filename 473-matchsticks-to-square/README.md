<h2><a href="https://leetcode.com/problems/matchsticks-to-square/">473. Matchsticks to Square</a></h2><h3>Medium</h3><hr><div><p>You are given an integer array <code>matchsticks</code> where <code>matchsticks[i]</code> is the length of the <code>i<sup>th</sup></code> matchstick. You want to use <strong>all the matchsticks</strong> to make one square. You <strong>should not break</strong> any stick, but you can link them up, and each matchstick must be used <strong>exactly one time</strong>.</p>

<p>Return <code>true</code> if you can make this square and <code>false</code> otherwise.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/09/matchsticks1-grid.jpg" style="width: 253px; height: 253px;">
<pre><strong>Input:</strong> matchsticks = [1,1,2,2,2]
<strong>Output:</strong> true
<strong>Explanation:</strong> You can form a square with length 2, one side of the square came two sticks with length 1.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> matchsticks = [3,3,3,3,4]
<strong>Output:</strong> false
<strong>Explanation:</strong> You cannot find a way to form a square with all the matchsticks.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= matchsticks.length &lt;= 15</code></li>
	<li><code>1 &lt;= matchsticks[i] &lt;= 10<sup>8</sup></code></li>
</ul>
</div>