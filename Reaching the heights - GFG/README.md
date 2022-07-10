# Reaching the heights
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">The teacher gives a mental ability question to Raju. The question is as follows:-</span></p>

<p><span style="font-size:18px">Raju is in an elevator. Given by his teacher is an array of size N which denotes the number of floors and has a 1 based indexing. The elevator starts from the ground and moves up and down, X and Y floors respectively. There is a code used in the elevator according to which it moves up X floors given at odd indexes of the array and moves down Y floors given at even indexes of the array. He is asked to go to the highest floor possible. Help him to sort the array such that he reaches the highest floor after traversing the whole array from starting till the end, without skipping any index.</span></p>

<p><span style="font-size:18px">He always prefers to move more number of floors up and less number of floors down. Once he gets into the elevator, the elevator should not reach the ground again, if it does print Not Possible.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {2, 3, 4, 5}
<strong>Output :</strong> 5 2 4 3
<strong>Explanation:</strong>
Array can be arranged as {5,3,4,2} or 
{4,3,5,2} or {4,2,5,3} but it will get 
arranged as {5,2,4,3} because he always 
prefer to move more number of floors up 
and less number of floors down.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {1, 1} <strong>
Output :</strong>  Not Possible </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>game_with_number()</strong> that takes sizeOfArray <strong>(n)</strong>, an array <strong>(arr)</strong>, and return the sorted array or if it is Not Possible return <strong>-1</strong>. The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*LOG(N)).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>

<p>&nbsp;</p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span></p>

<p><span style="font-size:18px">1&nbsp;≤&nbsp;N ≤&nbsp;10<sup>5</sup><br>
1&nbsp;≤ arr[i]&nbsp;≤&nbsp;10<sup>3</sup></span></p>
 <p></p>
            </div>