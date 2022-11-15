# Maximum sum Rectangle
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:20px">Given a 2D matrix M of dimensions RxC. Find the maximum sum submatrix in it.</span></p>

<p><strong><span style="font-size:20px">Example 1:</span></strong></p>

<pre><span style="font-size:20px"><strong>Input:</strong>
R=4
C=5
M=[[1,2,-1,-4,-20],
[-8,-3,4,2,1],
[3,8,10,1,3],
[-4,-1,1,7,-6]]
<strong>Output:</strong>
29
<strong>Explanation:</strong>
The matrix is as follows and the
blue rectangle denotes the maximum sum
rectangle.</span>
<img alt="Thumbnail" src="https://a.disquscdn.com/get?url=http%3A%2F%2Fwww.geeksforgeeks.org%2Fwp-content%2Fuploads%2Frectangle-11.png&amp;key=6UHjdHyGWQGo6f_kdpoBIQ&amp;w=320&amp;h=247" class="img-responsive">
</pre>

<p><span style="font-size:20px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:20px"><strong>Input:</strong>
R=2
C=2
M=[[-1,-2],[-3,-4]]
<strong>Output:</strong>
-1
<strong>Explanation:</strong>
Taking only the first cell is the 
optimal choice.</span></pre>

<p><br>
<span style="font-size:20px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>maximumSumRectangle()</strong> which takes the number R, C, and the 2D matrix M as input parameters and returns the maximum sum submatrix.</span></p>

<p><br>
<span style="font-size:20px"><strong>Expected Time Complexity:</strong>O(R*R*C)<br>
<strong>Expected Auxillary Space:</strong>O(R*C)</span><br>
&nbsp;</p>

<p><span style="font-size:20px"><strong>Constraints:</strong><br>
1&lt;=R,C&lt;=500<br>
-1000&lt;=M[i][j]&lt;=1000</span></p>
 <p></p>
            </div>