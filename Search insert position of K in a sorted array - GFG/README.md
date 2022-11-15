# Search insert position of K in a sorted array
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a sorted array&nbsp;<strong>Arr[]</strong>(0-index based)&nbsp;consisting of&nbsp;<strong>N&nbsp;</strong>distinct integers and an integer <strong>k</strong>, the task is to find the index of k, if its present in the array <strong>Arr[]</strong>. Otherwise, find the index where <strong>k</strong>&nbsp;must be inserted to keep the array sorted.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
Arr = {1, 3, 5, 6}
k = 5
<strong>Output:</strong> 2
<strong>Explaination:</strong> Since 5 is found at index 2 
as Arr[2] = 5, the output is 2.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
Arr = {1, 3, 5, 6}
k = 2
<strong>Output:</strong> 1
<strong>Explaination:</strong> Since 2 is not present in 
the array but can be inserted at index 1 
to make the array sorted.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>searchInsertK()</strong>&nbsp;which takes the array <strong>Arr[]</strong> and its size <strong>N </strong>and <strong>k&nbsp;</strong>as input parameters&nbsp;and returns the index.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(logN)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>4</sup><br>
-10<sup>3</sup> ≤ Arr[i]&nbsp;≤ 10<sup>3</sup><br>
-10<sup>3</sup>&nbsp;≤ k&nbsp;≤ 10<sup>3</sup></span></p>
 <p></p>
            </div>