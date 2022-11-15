# Form coils in a matrix
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a positive integer <strong>n</strong> that represents dimensions of a 4n x 4n matrix with values from 1 to 4*n*4*n filled from left to right and top to bottom. Your task is to form two coils from matrix and print the coils.</span></p>

<p><span style="font-size:18px">Follow the given examples for better understanding.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>n = </strong>1</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">10 6 2 3 4 8 12 16
7 11 15 14 13 9 5 1</span> 
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The matrix is </span>
<span style="font-size:18px">1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16</span>
<span style="font-size:18px">So, the two coils are as given in the Ouput.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>n = </strong>2</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">36 28 20 21 22 30 38 46
54 53 52 51 50 42 34 26
18 10 2 3 4 5 6 7 8
16 24 32 40 48 56 64

29 37 45 44 43 35 27 19
11 12 13 14 15 23 31 39
47 55 63 62 61 60 59 58
57 49 41 33 25 17 9 1 </span> 
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px"><img alt="" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/MatrixCoil.jpg" style="height:266px; width:400px" class="img-responsive">
</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>formCoils()</strong> which takes an Integer n as input and returns a vector of two vectors representing coil1 and coil2.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n<sup>2</sup>)<br>
<strong>Expected Auxiliary Space:</strong> O(n<sup>2</sup>)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= n &lt;= 20</span></p>
 <p></p>
            </div>