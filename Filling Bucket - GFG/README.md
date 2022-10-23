# Filling Bucket
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a Bucket&nbsp;having a capacity of&nbsp;<strong>N</strong>&nbsp;litres and the task is&nbsp;to determine that by how many ways you can fill it using two bottles&nbsp;of capacity of&nbsp;<strong>1 Litre and 2 Litre only</strong>. Find the answer modulo 10<sup>8</sup>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
3
<strong>Output:</strong>
3 </span>
<span style="font-size:18px"><strong>Explanation:</strong>
Let O denote filling by 1 litre bottle and
T denote filling by 2 litre bottle.
So for N = 3, we have :
{OOO,TO,OT}. Thus there are 3 total ways.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
4
<strong>Output:</strong>
5 </span>
<span style="font-size:18px"><strong>Explanation:</strong>
Let O denote filling by 1 litre bottle and
T denote filling by 2 litre bottle.
So for N = 4, we have :
{TT,OOOO,TOO,OTO,OOT} thus there are 5 total ways.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>fillingBucket()</strong> which takes an Integer N as input and returns the number of total ways possible.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 10<sup>5</sup></span></p>
</div>