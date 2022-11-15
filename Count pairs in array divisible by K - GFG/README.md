# Count pairs in array divisible by K
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array&nbsp;<strong>A[]&nbsp;</strong>and positive integer&nbsp;<strong>K</strong>, the task is to count total number of pairs in the array whose sum is divisible by&nbsp;<strong>K</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> 
A[] = {2, 2, 1, 7, 5, 3}, K = 4
<strong>Output :</strong> 5
<strong>Explanation : </strong>
There are five pairs possible whose sum
is divisible by '4' i.e., (2, 2), 
(1, 7), (7, 5), (1, 3) and (5, 3)</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> 
A[] = {5, 9, 36, 74, 52, 31, 42}, K = 3
<strong>Output :</strong> 7 
<strong>Explanation : </strong>
There are seven pairs whose sum is divisible by 3, 
i.e, (9, 36), (9,42), </span><span style="font-size:18px">(74, 52), (36, 42), (74, 31), 
(31, 5) and (5, 52).
</span></pre>

<div><span style="font-size:18px"><strong>Your task :</strong></span></div>

<div><span style="font-size:18px">You don't have to read input or print anything. Your task is to complete the function <strong>countKdivPairs()</strong> which takes the array, it's size and an integer K as input and returns the count of pairs whose sum is divisible by K.</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Expected Time Complexity :</strong> O(n)</span></div>

<div><span style="font-size:18px"><strong>Expected Auxiliary Space :</strong> O(k)</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Constraints :</strong></span></div>

<div><span style="font-size:18px">1 &lt;= N &lt;=10^6</span></div>

<div><span style="font-size:18px">1 &lt;= A[i] &lt;= 10^6</span></div>

<div><span style="font-size:18px">1 &lt;= K &lt;= 100</span></div>
 <p></p>
            </div>