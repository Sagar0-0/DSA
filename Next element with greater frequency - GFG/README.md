# Next element with greater frequency
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array&nbsp;<strong>arr[ ]</strong>&nbsp;of&nbsp;<strong>n</strong>&nbsp;integers, for every element, find the closest element on it's right that has a greater frequency than its own frequency.</span></p>

<blockquote>
<p><span style="font-size:18px">Frequency is the number of times the&nbsp;element appears in the array.</span></p>
</blockquote>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
n = 6
arr[] = {2 1 1 3 2 1}<strong>
Output:</strong>
1 -1 -1 2 1 -1 
<strong>Explanation:
</strong>1 appears 3 times.
2 appears 2 times.
3 appears 1 time. 

For arr[0] ie, 2
arr[1] ie 1 is the closest element on its 
right which has greater frequency than the 
frequency of 2. For the arr[1] and arr[2] no element 
on the right has greater frequency than 1, 
so -1 will be printed. and so on. </span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 10
arr[] = {5 1 2 3 2 5 5 4 5 2}
<strong>Output:</strong>
-1 2 5 2 5 -1 -1 5 -1 -1</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your task:</strong><br>
Your task is to complete the function&nbsp;<strong>print_next_greater_freq() </strong>which take two parameters <strong>arr</strong> and <strong>n</strong>.This function returns&nbsp;answer(as a list of integers)&nbsp;as explained above.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected time complexity:</strong> O(n)<br>
<strong>Expected space complexity: </strong>O(n)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n &lt;= 10<sup>4</sup><br>
1 &lt;= arr[i] &lt;=&nbsp;10<sup>4</sup></span></p>
 <p></p>
            </div>