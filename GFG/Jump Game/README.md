# Jump Game
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an positive integer N and a list of N integers A[]. Each element in the array denotes the maximum length of jump you can cover. Find out if you can make it to the last index if you start at the first index of the list.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>6
<strong>A[] = </strong>{1, 2, 0, 3, 0, 0}</span><strong> </strong>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">1</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">Jump 1 step from first index to
second index. Then jump 2 steps to reach 
4<sub>th </sub>index, and now jump 2 steps to reach
the end.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>3
<strong>A[] </strong><strong>=  </strong>{1, 0, 2}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">0</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">You can't reach the end of the array.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>canReach()</strong> which takes a Integer N and a list A of size N as input and returns 1 if the end of the array is reachable, else return 0.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 10<sup>5</sup><br>
0 &lt;= A[i] &lt;= 10<sup>5</sup></span></p>
 <p></p>
            </div>