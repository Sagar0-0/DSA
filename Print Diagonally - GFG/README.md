# Print Diagonally
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Give a <strong>N * N</strong> square matrix <strong>A</strong>, return all the elements of its anti-diagonals from <strong>top to bottom</strong>. </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
N = 2
A = [[1, 2],
     [3, 4]]
<strong>Output:</strong>
1 2 3 4
<strong>Explanation:</strong> 
<img alt="" src="https://media.geeksforgeeks.org/img-practice/ScreenShot2022-10-17at9-1665980852.png">
</span><span style="font-size:18px">Hence, elements will be returned in the 
order {1, 2, 3, 4}.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: 
</strong>N = 3 
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
<strong>Output:</strong> 
1 2 4 3 5 7 6 8 9
<strong>Explanation:</strong> 
<img alt="" src="https://media.geeksforgeeks.org/img-practice/ScreenShot2022-10-17at9-1665980941.png">
Hence, elements will be returned in 
the order {1, 2, 4, 3, 5, 7, 6, 8, 9}.
</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>downwardDigonal()</strong> which takes an integer <strong>N</strong> and a 2D matrix <strong>A[ ][ ]</strong> as input parameters and returns the list of all elements of its anti-diagonals from <strong>top to bottom</strong>.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N*N)<br>
<strong>Expected Auxillary Space:&nbsp;</strong>O(N*N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N, M ≤ 10<sup>3</sup><br>
0 ≤ A[i][j] ≤ 10<sup>6</sup></span></p>
</div>