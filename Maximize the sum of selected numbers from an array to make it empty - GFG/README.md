# Maximize the sum of selected numbers from an array to make it empty
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a array of<strong> N</strong> numbers, we need to maximize the sum of selected numbers. At each step, you need to select a number A<sub>i</sub>, delete one occurrence of&nbsp;<strong>A<sub>i</sub>-1 (if exists), and A<sub>i</sub></strong>&nbsp;each from the array. Repeat these steps until the array gets empty. The problem is to maximize the sum of the selected numbers.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {1, 2, 2, 2, 3, 4}
<strong>Output :</strong> 10
<strong>Explanation:</strong>
We select 4, so 4 and 3 are deleted leaving us with {1,2,2,2}.
Then we select 2, so 2 &amp; 1 are deleted. We are left with{2,2}.
We select 2 in next two steps, thus the sum is 4+2+2+2=10.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {1, 2, 3} <strong>
Output :</strong>  4
<strong>Explanation:</strong> We select 3, so 3 and 2 are deleted leaving us with {1}. Then we select 1, 0 doesn't exist so we delete 1. thus the sum is 3+1=4.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>maximizeSum()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n),</strong>&nbsp;and return the maximum sum of the selected numbers. The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N).</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ A[i] ≤ 10<sup>5</sup><br>
<strong>Note:</strong> Numbers need to be selected from maximum to minimum.</span></p>
</div>