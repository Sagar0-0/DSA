# Brackets in Matrix Chain Multiplication
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array&nbsp;<strong>p[]</strong>&nbsp;of length <strong>n </strong>used to denote the dimensions of a series of matrices such that&nbsp;dimension of <strong>i'th</strong> matrix is <strong>p[i] * p[i+1]</strong>. There are a total of&nbsp;<strong>n-1</strong> matrices.&nbsp;Find the most efficient way to multiply these matrices together.&nbsp;<br>
The problem is not actually to perform the multiplications, but merely to decide in which order to perform the multiplications such that you need to perform minimum number of multiplications. There are&nbsp;many options to multiply a chain of matrices because matrix multiplication is associative i.e.&nbsp;no matter how one&nbsp;parenthesize the product, the result will be the same.</span></p>

<p><br>
<strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
n = 5
p[] = {1, 2, 3, 4, 5}
<strong>Output:</strong> (((AB)C)D)
<strong>Explaination:</strong> The total number of 
multiplications are (1*2*3) + (1*3*4) 
+ (1*4*5) = 6 + 12 + 20 = 38.</span></pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
n = 3
p = {3, 3, 3}
<strong>Output:</strong> (AB)
<strong>Explaination:</strong> The total number of 
multiplications are (3*3*3) = 27.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>matrixChainOrder()</strong> which takes n and p[] as input parameters and returns the string with the proper order of parenthesis for n-1 matrices. Use uppercase alphabets to denote each matrix.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n<sup>3</sup>)<br>
<strong>Expected Auxiliary Space:</strong> O(n<sup>2</sup>)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
2 ≤ n ≤ 26&nbsp;<br>
1 ≤ p[i] ≤ 500&nbsp;</span></p>
 <p></p>
            </div>