# Smallest greater elements in whole array
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array <strong>A</strong> of <strong>N</strong> length. We need to calculate the next greater element for each element in a given array. If the next greater element is not available in a given array then we need to fill <strong>-10000000</strong> at that index place.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[] = {13, 6, 7, 12}
<strong>Output :</strong> _ 7 12 13 
<strong>Explanation:</strong>
Here, at index 0, 13 is the greatest value 
in given array and no other array element 
is greater from 13. So at index 0 we fill 
'-10000000'.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[] = {6, 3, 9, 8, 10, 2, 1, 15, 7} <strong>
Output :</strong>  7 6 10 9 15 3 2 _ 8
<strong>Explanation:</strong> Here, at index 7, 15 is the greatest
value in given array and no other array element is
greater from 15. So at index 7 we fill '-10000000'.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>greaterElement()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, and return an&nbsp;array that displays the next greater element to element at that index.&nbsp;The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*LOG(N)).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
-10<sup>6</sup> ≤ A<sub>i</sub> ≤ 10<sup>6</sup></span></p>

<p>&nbsp;</p>
 <p></p>
            </div>