# Swap bits
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a number X and two positions (from right side) in binary representation of x, write a program that swaps N bits at given two positions and returns the result.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
X = 47
P1 = 1
P2 = 5
N = 3
<strong>Output:</strong>&nbsp;227
<strong>Explanation</strong>:
The 3 bits starting from the second bit 
(from the right side) are swapped with 3 bits
starting from 6th position (from the right side) </span></pre>

<pre><span style="font-size:18px">X = 47 (</span><span style="font-size:18px">00101111)
[001]0[111]1
ANS = [111]0[001]1
ANS = 227 (</span><span style="font-size:18px">11100011)
Hence, the result is 227.  
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
X = 28
P1 = 0
P2 = 3
N = 2
<strong>Output:&nbsp;</strong>7</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>swapBits()</strong>&nbsp;which takes the integer X, integer P1, integer P2, and&nbsp;integer&nbsp;N<strong>&nbsp;</strong>as input parameters and returns the new integer after swapping.&nbsp;<br>
<br>
<strong>Expected Time Complexity:</strong> O(1)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span><br>
&nbsp;</p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ X ≤ 200<br>
0 ≤ P1 &lt; P2&nbsp;≤ 11<br>
1 ≤ N ≤ 5</span><br>
<br>
&nbsp;</p>
 <p></p>
            </div>