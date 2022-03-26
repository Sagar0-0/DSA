# Maximum average subarray
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array <strong>Arr</strong>&nbsp;of size <strong>N</strong> and a positive integer <strong>K</strong>, find the sub-array of length <strong>K</strong> with the maximum&nbsp;average. </span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>K = 4, N = 6
Arr[] = {1, 12, -5, -6, 50, 3}
<strong>Output:</strong> 12 -5 -6 50
<strong>Explanation:</strong> Maximum average is 
(12 - 5 - 6 + 50)/4 = 51/4.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>K = 3, N = 7
Arr[] = {3, -435, 335, 10, -50, 100, 20}
<strong>Output:</strong> 335 10 -50
<strong>Explanation:</strong>&nbsp;Maximum average is 
(335 + 10 - 50)/3 = 295/3.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>findMaxAverage()</strong>&nbsp;which takes the array of integers&nbsp;<strong>arr, </strong>its size <strong>n</strong>&nbsp;and integer&nbsp;<strong>k&nbsp;</strong>as input parameters and returns an integer&nbsp;denoting the starting index of the subarray.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)<br>
<br>
<strong>Constraints</strong><br>
1 &lt;=&nbsp;N &lt;= 10<sup>5</sup><br>
0 &lt;= |Arr[i]| &lt;= 10<sup>3</sup></span></p>
 <p></p>
            </div>