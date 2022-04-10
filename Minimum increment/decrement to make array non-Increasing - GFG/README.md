# Minimum increment/decrement to make array non-Increasing
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px"><strong>Note: This&nbsp;<a href="http://practice.geeksforgeeks.org/problem-of-the-day" target="_blank">POTD</a>&nbsp;is a part of&nbsp;<a href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=potd&amp;utm_medium=problempage&amp;utm_campaign=gsc22" target="_blank">Geek Summer Carnival</a>. Solve all POTD consecutively from 5th to 10th April and get a chance to win exclusive discount vouchers on our GfG courses.</strong></span></p>

<hr>
<p><span style="font-size:18px">Given an array <strong>a</strong> of length <strong>n</strong>, find the <strong>minimum</strong> number of operations required to make it <strong>non-increasing</strong>.&nbsp;You can select any one of the following operations and preform it any number of times on an array element.</span></p>

<ul>
	<li><span style="font-size:18px">increment the array element by 1.</span></li>
	<li><span style="font-size:18px">decrement the array element by 1.&nbsp;</span></li>
</ul>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">N = 4 
array = {3, 1, 2, 1}</span>
<span style="font-size:18px"><strong>Output:</strong> 1</span>
<span style="font-size:18px"><strong>Explanation: </strong>
Decrement array[2] by 1. 
New array becomes {3,1,1,1} which is non-increasing. 
Therefore, only 1 step is required. </span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">N = 4 
array = {3, 1, 5, 1}</span>
<span style="font-size:18px"><strong>Output:</strong> 4</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Complete the function <strong>minOperations()</strong> that takes <strong>n</strong>&nbsp;and array <strong>a</strong> as input parameters and returns the <strong>minimum </strong>number of operations required.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected time complexity:</strong> O(nlogn)<br>
<strong>Expected space complexity:</strong> O(n)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n&nbsp;&lt;= 10^4<br>
1 &lt;= a[i] &lt;= 10^4</span></p>
 <p></p>
            </div>