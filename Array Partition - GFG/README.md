# Array Partition
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an&nbsp;array of <strong>N</strong> integers, you have to find if it is possible to partition the array with following rules:</span></p>

<ul>
	<li><span style="font-size:18px">Each element should belong to exactly one partition.</span></li>
	<li><span style="font-size:18px">Each partition should have atleast <strong>K</strong> elements.</span></li>
	<li><span style="font-size:18px">Absolute difference between any pair of elements in the same partition should not exceed <strong>M</strong>.</span></li>
</ul>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
K = 2
M = 3
A[] = {8, 3, 9, 1, 2}
<strong>Output:</strong>
YES
<strong>Explanation</strong>:
We can partition the array into two 
partitions: {8, 9} and {3, 1, 2} such that
all rules are satisfied.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>partitionArray()</strong>&nbsp;which takes the number of elements&nbsp;<strong>N,</strong>&nbsp;integer <strong>K,</strong>&nbsp;integer <strong>M&nbsp;</strong>and array&nbsp;<strong>A[ ]</strong>&nbsp;as input parameters&nbsp;and returns true if we can partition the array such that all rules are satisfied, else returns false.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N * Log(N))<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N&nbsp;≤ 2*10<sup>5</sup><br>
1 ≤ K&nbsp;≤ N<br>
1 ≤ M&nbsp;≤ 10<sup>9</sup><br>
1 ≤ A[i]&nbsp;≤ 10<sup>9</sup></span></p>
 <p></p>
            </div>