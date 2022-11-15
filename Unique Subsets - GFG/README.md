# Unique Subsets
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array <strong>arr[]</strong><strong> </strong>of integers&nbsp;of size <strong>N</strong> that might contain <strong>duplicates</strong>, the task is to find all possible unique subsets.</span></p>

<p><span style="font-size:18px"><strong>Note:</strong> Each subset should be sorted.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 3, arr[] = {2,1,2}
<strong>Output:</strong>(),(1),(1 2),(1 2 2),(2),(2 2)</span>
<span style="font-size:18px"><strong>Explanation: </strong>
All possible subsets = (),(2),(1),(1,2),(2),(2,2),(2,1),(2,1,2)
After Sorting each subset = (),(2),(1),(1,2),(2),(2,2),(1,2),(1,2,2) 
Unique Susbsets in Lexicographical order = (),(1),(1,2),(1,2,2),(2),(2,2)</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 4, arr[] = {1,2,3,3}
<strong>Output: </strong>(),(1),(1 2),(1 2 3)
(1 2 3 3),(1 3),(1 3 3),(2),(2 3)
(2 3 3),(3),(3 3)</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Your task is to complete the function <strong>AllSubsets()</strong>&nbsp;which takes the array <strong>arr[]</strong> and <strong>N</strong> as input parameters and returns list of&nbsp;all possible unique subsets in lexicographical order.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(2<sup>N</sup>).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(2<sup>N</sup>&nbsp;* X), X = Length of each subset.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 12</span><br>
<span style="font-size:18px">1 ≤ arr[i] ≤ 9</span></p>
 <p></p>
            </div>