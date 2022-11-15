# Pairs of Non Coinciding Points
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">In a given cartesian plane, there are <strong>N</strong> points. We need to find the Number of Pairs of &nbsp;points(<strong>A, B</strong>) such that</span></p>

<ul>
	<li><span style="font-size:18px">Point A and Point B do not coincide.</span></li>
	<li><span style="font-size:18px">Manhattan Distance&nbsp;and the Euclidean Distance between the points should be equal.</span></li>
</ul>

<p><span style="font-size:18px"><strong>Note:</strong> Pair of 2 points(A,B) is considered same as Pair of 2 points(B ,A).<br>
Manhattan Distance = |x2-x1|+|y2-y1|</span><br>
<span style="font-size:18px">Euclidean Distance &nbsp; = ((x2-x1)^2 + (y2-y1)^2)^0.5, where points are (x1,y1) and (x2,y2).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong></span><span style="font-size:18px">2</span>
<span style="font-size:18px"><strong>X = </strong>{1, 7}</span>
<span style="font-size:18px"><strong>Y = </strong>{1, 5}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">0</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">None of the pairs of points have
equal Manhatten and Euclidean distance.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong></span><span style="font-size:18px">3</span>
<span style="font-size:18px"><strong>X = </strong>{1, 2, 1}</span>
<span style="font-size:18px"><strong>Y = </strong>{2, 3, 3}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">2</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The pairs {(1,2), (1,3)}, and {(1,3), (2,3)}
have equal Manhatten and Euclidean distance.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>numOfPairs()</strong> which takes an Integer N and two arrays X, and Y of length N as input and returns the number of pairs with equal Manhattan and Euclidean Distance. (X[i], Y[i]) denotes a point.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 10<sup>5</sup></span><br>
&nbsp;<span style="font-size:18px">-10^9</span> <span style="font-size:18px">&lt;= X[i], Y[i] &lt;= 10^9</span></p>
 <p></p>
            </div>