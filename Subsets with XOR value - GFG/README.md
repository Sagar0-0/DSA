# Subsets with XOR value
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:20px">Given an array arr&nbsp;of N integers&nbsp;and an integer&nbsp;K, find the number of subsets of arr having XOR of elements as K.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
k = 6
arr: 6 9 4 2</span><span style="font-size:18px">
<strong>Output:</strong>
2
<strong>Explanation:</strong>
The subsets are 
{4,2} and {6}</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
K = 4
arr: </span><span style="font-size:18px">1 2 3 4 5
<strong>Output:</strong>
4
<strong>Explanation:</strong>
The subsets are {1, 5},
{4}, {1, 2, 3, 4},
and {2, 3, 5}</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>subsetXORâ€‹()</strong>&nbsp;which takes the array arr[], its size N and an integer K as input parameters&nbsp;and returns the number of subsets having xor as K</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N*M)<br>
<strong>Expected Space Complexity: </strong>O(N*M)<br>
Note: M = maximum value any XOR subset will acquire</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=N&lt;=20<br>
1&lt;=K&lt;=100<br>
0&lt;=arr[i]&lt;=100</span></p>
 <p></p>
            </div>