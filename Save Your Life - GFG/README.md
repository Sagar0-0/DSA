# Save Your Life
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string&nbsp;<strong>w</strong>, integer array <strong>b,</strong> &nbsp;character array <strong>x&nbsp;</strong>and an integer <strong>n</strong>. <strong>n</strong>&nbsp;is the size of array <strong>b</strong> and array&nbsp;<strong>x</strong>. Find a substring which has the sum of the ASCII values of its every character, as maximum. ASCII values of some characters&nbsp;are redefined.<br>
<strong>Note:</strong></span><strong>&nbsp;</strong><span style="font-size:18px">Uppercase &amp; lowercase both will be present in the string&nbsp;<strong>w</strong>. Array <strong>b</strong>&nbsp;and Array <strong>x</strong>&nbsp;contain corresponding redefined ASCII values. For each i,&nbsp;0&lt;=ib[i] contain redefined ASCII value of character&nbsp;<strong>x[i]</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
W = abcde
N = 1
X[] = { 'c' }
B[] = { -1000 }
<strong>Output:</strong>
de
<strong>Explanation:
</strong>Substring "de" has the
maximum sum of ascii value,
including c decreases the sum value</span>
</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
W = dbfbsdbf 
N = 2
X[] = { 'b','s' }
B[] = { -100, 45  }
<strong>Output:</strong>
dbfbsdbf</span><span style="font-size:18px">
<strong>Explanation:
</strong>Substring "dbfbsdbf</span><span style="font-size:18px">" has the maximum
sum of ascii value.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>maxSum()</strong>&nbsp;which takes&nbsp;string <strong>W</strong>, character array <strong>X</strong>, integer array <strong>B</strong>, integer <strong>N</strong> as length of array <strong>X</strong> and <strong>B</strong>&nbsp;as input parameters and returns the substring with the maximum sum of ascii value.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(|W|)<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span></p>

<p><span style="font-size:18px">1&lt;=|W|&lt;=100000<br>
1&lt;=|X|&lt;=52<br>
-1000&lt;=B<sub>i</sub>&lt;=1000</span></p>

<p><span style="font-size:18px">Each character of W and A will be from a-z, A-Z.</span></p>
</div>