# Replace every element with the least greater element on its right
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr[]</strong> of <strong>N</strong> integers and replace every element with the least greater element on its right side in the array. If there are no greater elements on the right side, replace it with <strong>-1.</strong>&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
arr[] = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28}
<strong>Output: </strong>{18, 63, 80, 25, 32, 43, 80, 93, 80, 25, 93, -1, 28, -1, -1}
<strong>Explanation:</strong> 
The least next greater element of 8 is 18.
The least next greater element of 58 is 63 and so on.

</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
arr[] = {2, 6, 9, 1, 3, 2}
<strong>Output: </strong>{3, 9, -1, 2, -1, -1}
<strong>Explanation:</strong> 
The least next greater element of 2 is 3. 
The least next greater element of 6 is 9.
least next greater element for 9 does not
exist and so on.
</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>findLeastGreater</strong>()&nbsp;which takes an array <strong>arr[]</strong> of size <strong>N</strong>&nbsp;and returns a&nbsp;list as an output.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N* log N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>5</sup><br>
1&nbsp;&lt;= A[i] &lt;= 10<sup>5</sup></span></p>
</div>