# Find Transition Point
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a sorted array containing only 0s and 1s, find the transition point.&nbsp;</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
arr[] = {0,0,0,1,1}
<strong>Output:</strong> 3
<strong>Explanation:</strong> index 3 is the transition 
point where 1 begins.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
arr[] = {0,0,0,0}
<strong>Output:</strong> -1
<strong>Explanation:</strong> Since, there is no "1",
the answer is -1.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. The task is to complete the function <strong>transitionPoint()</strong> that takes array and N as input parameters and returns the 0 based index of the position where "0" ends and "1" begins. If array does not have any 1s, return -1. If array does not have any 0s, return 0.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(LogN)<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 500000<br>
0 ≤ arr[i] ≤ 1</span></p>
 <p></p>
            </div>