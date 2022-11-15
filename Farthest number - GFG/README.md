# Farthest number
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array <strong>A</strong><strong>rr[]</strong>&nbsp;of size&nbsp;<strong>N</strong>. For every element in the array, the task is to find the index of the farthest element in the array to the right which is smaller than the current element. If no such number exists then print&nbsp;<strong>-1</strong>.</span><br>
<strong><span style="font-size:18px">Note: </span></strong><span style="font-size:18px">0 based indexing.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> </span>
<span style="font-size:18px">N=5</span>
<span style="font-size:18px">Arr[] = {3, 1, 5, 2, 4}</span>
<span style="font-size:18px"><strong>Output:</strong> </span>
<span style="font-size:18px">3 -1 4 -1 -1</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">Arr[3] is the farthest smallest element
to the right of Arr[0].
Arr[4] is the farthest smallest element
to the right of Arr[2].
And for the rest of the elements, there is
no smaller element to their right.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> </span>
<span style="font-size:18px">N=5</span>
<span style="font-size:18px">Arr[] = {1, 2, 3, 4, 0}</span>
<span style="font-size:18px"><strong>Output:</strong> </span>
<span style="font-size:18px">4 4 4 4 -1</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;</strong></span><br>
<span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function<strong> farNumber()</strong>&nbsp;which takes the N&nbsp;(number of elements in Array Arr) ,Arr[], and returns the array&nbsp;of farthest element to the right for&nbsp;every&nbsp;element of the array.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N*logN)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><br>
<strong><span style="font-size:18px">Constraints:</span></strong><br>
<span style="font-size:18px">1 </span> <span style="font-size:18px">≤ </span> <span style="font-size:18px">N</span> <span style="font-size:18px">≤ </span> <span style="font-size:18px">1e5<br>
0</span> <span style="font-size:18px">≤ </span> <span style="font-size:18px">Arr[i]</span>&nbsp;<span style="font-size:18px">≤ </span> <span style="font-size:18px">1e9&nbsp;</span></p>
 <p></p>
            </div>