# Number Formation
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given three integers <strong>x, y,</strong> and <strong>z,</strong> the task is to find the sum of all the numbers formed by&nbsp;<br>
having 4 at most x times, having 5 at most y times, and having 6 at most z times as a digit.</span></p>

<p><span style="font-size:20px"><strong>Note: </strong></span><span style="font-size:18px">Output&nbsp;the sum modulo 10<sup>9</sup>+7.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: X = 1, Y = 1, Z = 1 
<strong>Output:</strong> 3675</span>
<span style="font-size:18px"><strong>Explanation</strong>: 4 + 5 + 6 + 45 + 54 + 56 
+ 65 + 46 + 64 + 456 + 465 
+ 546 + 564 + 645 + 654 = 3675</span></pre>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre><span style="font-size:18px"><strong>Input: </strong>X = 0, Y = 0, Z = 0
<strong>Output: </strong>0
<strong>Explanation</strong>: No number can be formed</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Complete the function <strong><code>getSum</code>()&nbsp;</strong>which takes <strong>X, Y</strong> and <strong>Z </strong>as input parameters and returns the integer value<br>
<br>
<strong>Expected Time Complexity:</strong> O(<strong>X*Y*Z</strong>)<br>
<strong>Expected Auxiliary Space:</strong> O(<strong>X*Y*Z</strong>)<br>
<br>
<strong>Constraints:</strong><br>
0 ≤ <strong>X, Y, Z</strong> ≤ 60</span></p>
</div>