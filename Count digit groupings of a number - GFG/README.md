# Count digit groupings of a number
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a string str consisting of digits, one&nbsp;may group these digits into sub-groups while&nbsp;maintaining their original order.<br>
The task is to count number of groupings such that for every sub-group except the last one, sum of digits in a sub-group is less than or equal to sum of the digits in the sub-group immediately on its right.</span></p>

<p><span style="font-size:18px">For example, a valid grouping of digits of number 1119 is (1-11-9). Sum of digits in first subgroup is 1, next subgroup is 2, and last subgroup is 9. Sum of every subgroup is less than or equal to its immediate right.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:&nbsp;</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>str = "1119"
<strong>Output: </strong>7
<strong>Explanation: </strong></span><span style="font-size:18px">[1-119], [1-1-19], [1-11-9], 
[1-1-1-9], [11-19], [111-9] and [1119] 
are seven sub-groups.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>str = "12"
<strong>Output: </strong>2
<strong>Explanation: </strong>[1-2] and [12] are two sub-groups.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>TotalCount()</strong>&nbsp;which takes the string str as input parameter and returns total possible groupings.<br>
<br>
<strong>Expected Time&nbsp;Complexity:&nbsp;</strong>O(N * N ) where N is length of string.<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(N * N)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= length of string&nbsp;&lt;= 100</span></p>
 <p></p>
            </div>