# Reverse Spiral Form of Matrix
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a matrix as 2D array. Find the reverse&nbsp;spiral traversal of the matrix.&nbsp;<br>
<br>
<strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: R = 3, C = 3
  a = {{9, 8, 7},
       {6, 5, 4},
&nbsp;      {3, 2, 1}}
<strong>Output: </strong>5 6 3 2 1 4 7 8 9
<strong>Explanation</strong>: Spiral form of the matrix
in reverse order starts from the centre 
and goes outward.
<img alt="" src="https://media.geeksforgeeks.org/img-practice/ScreenShot2022-10-17at10-1665981362.png" style="height:181px; width:200px"></span>

</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>R = 4, C = 4<strong> 
</strong>  a = {{1, 2, 3, 4},
       {5, 6, 7, 8},
&nbsp;      {9, 10, 11, 12}, 
&nbsp;      {13, 14, 15, 16}}
<strong>Output: </strong>10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1
<strong>Explanation</strong>: 
<img alt="" src="https://media.geeksforgeeks.org/img-practice/ScreenShot2022-10-17at10-1665981582.png">
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You dont need to read input or print anything. Complete the function <strong>reverseSpiral()&nbsp;</strong>which takes <strong>R, C </strong>and<strong> a</strong>&nbsp;as input parameters and returns the matrix in reverse spiral form.</span><br>
<br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(R*C)<br>
<strong>Expected Auxiliary Space:</strong> O(R*C)<br>
<br>
<strong>Constraints:</strong><br>
1&nbsp;&lt;= R,C&nbsp;&lt;=100<br>
1&nbsp;&lt;= a[R][C] &lt;=100</span></p>
</div>