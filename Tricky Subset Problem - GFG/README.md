# Tricky Subset Problem
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">N children are made to stand in a queue. Each of them is given a number A[i]. The teacher writes a number S on a page and passes it to the first child. Each child must add all the numbers they see on the page along with their own number, write the sum on the paper and pass it to the next person.&nbsp;<br>
In the end, the teacher must determine if X can be formed by adding some of the numbers from the series of numbers written on the paper.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
S = 1, N = 4, X = 7
A = {1, 2, 4, 2}
<strong>Output:</strong> yes
<strong>Explaination:</strong> The final sequence of 
numbers on the paper is 1, 2, 5, 12, 22. 
Using 2 and 5 we can form 7. </span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
S = 100, N = 2, X = 500
A = {51, 88}
<strong>Output: </strong>no
<strong>Explaination:</strong> The final sequence of 
numbers on the paper is 100, 151, 339. 
Using these numbers we cannot form 500.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>isPossible() </strong>which takes S, N, X and array A as input parameters and returns 1 if there is a subset which adds to this sum. Otherwise returns 0.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N)<br>
<strong>Expected Auxiliary Space: </strong>O(N)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ S, A<sub>i</sub>&nbsp;, X ≤ 10<sup>18</sup>&nbsp;&nbsp;</span></p>
 <p></p>
            </div>