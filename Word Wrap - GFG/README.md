# Word Wrap
## Medium 
<div class="problem-statement">
                <p></p><div class="row bottom">
<div class="col-xs-12 textAlign">
<div class="modifiedAnswer">
<p><span style="font-size:18px">Given an array <strong>nums[]</strong> of size <strong>n</strong>, where&nbsp;<strong>nums[i]</strong>&nbsp;denotes the number of characters in one word.</span><span style="font-size:18px">&nbsp;Let <strong>K</strong>&nbsp;be the&nbsp;limit on the number of characters that can be put in one line (line width). Put line breaks in the given sequence such that the lines are printed neatly.<br>
Assume that the length of each word is smaller than the line width. When line breaks are inserted there is a possibility that extra spaces are present in each line. The extra spaces include spaces put at the end of every line <strong>except the last one</strong>.&nbsp;</span></p>

<p><span style="font-size:18px">You have&nbsp;to <strong>minimize </strong>the following total cost where <strong>total cost </strong>= Sum of cost of all lines, where cost of line is = (Number of extra spaces in the line)<sup>2</sup>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>nums = {3,2,2,5}, k = 6
<strong>Output: </strong>10
<strong>Explanation</strong>: Given a line can have 6
characters,
Line number 1: From word no. 1 to 1
Line number 2: From word no. 2 to 3
Line number 3: From word no. 4 to 4
So total cost = (6-3)<sup>2</sup> + (6-2-2-1)<sup>2</sup> = 3<sup>2</sup>+1<sup>2</sup> = 10.
As in the first line word length = 3 thus
extra spaces = 6 - 3 = 3 and in the second line
there are two word of length 2 and there already
1 space between two word thus extra spaces
= 6 - 2 -2 -1 = 1. As mentioned in the problem
description there will be no extra spaces in
the last line. Placing first and second word
in first line and third word on second line
would take a cost of 0<sup>2</sup> + 4<sup>2</sup> = 16 (zero spaces
on first line and 6-2 = 4 spaces on second),
which isn't the minimum possible cost.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>nums = {3,2,2}, k = 4
<strong>Output: </strong>5
<strong>Explanation: </strong>Given a line can have 4 
characters,
Line number 1: From word no. 1 to 1
Line number 2: From word no. 2 to 2
Line number 3: From word no. 3 to 3
Same explaination as above total cost
= (4 - 3)<sup>2</sup> + (4 - 2)<sup>2</sup> = 5<strong>.</strong></span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anyhting. Your task is to complete the function&nbsp;<strong>solveWordWrap()&nbsp;</strong>which takes nums and k as input paramater and returns the minimized total cost.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n<sup>2</sup>)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(n)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n ≤ 500<br>
1 ≤ nums[i] ≤ 1000<br>
max(nums[i]) ≤ k ≤ 2000</span></p>
</div>
</div>
</div>
 <p></p>
            </div>