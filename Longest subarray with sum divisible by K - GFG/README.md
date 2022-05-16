# Longest subarray with sum divisible by K
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array containing <strong>N</strong> integers and a positive integer <strong>K</strong>, find the length of the longest sub array with sum of the elements divisible by the given value <strong>K</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>A[] = {2, 7, 6, 1, 4, 5}
K = 3
<strong>Output:</strong> 4
<strong>Explanation:</strong>The subarray is {7, 6, 1, 4}
with sum 18, which is divisible by 3.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>A[] = {-2, 2, -5, 12, -11, -1, 7}
K = 3
<strong>Output:</strong> 5
<strong>Explanation:
</strong>The subarray is {2,-5,12,-11,-1} with
sum -3, which is divisible by 3.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The input is already taken care of by the driver code. You only need to complete the function <strong>longSubarrWthSumDivByK()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, positive integer <strong>K</strong>, and return the length of the longest subarray which has sum divisible by <strong>K</strong>. The driver code takes care of the printing.<br>
<br>
<strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=N,K&lt;=10<sup>6</sup><br>
-10<sup>5</sup>&lt;=A[i]&lt;=10<sup>5</sup></span><br>
&nbsp;</p>
 <p></p>
            </div>