# Minimum X (xor) A
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given two integers&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>, the task is to find an integer&nbsp;<strong>X</strong>&nbsp;such that&nbsp;<strong>(X XOR A)</strong>&nbsp;is minimum possible and the count of set bit in&nbsp;<strong>X</strong>&nbsp;is equal to the count of set bits in&nbsp;<strong>B</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
A = 3, B = 5
<strong>Output:</strong> 3
<strong>Explanation:</strong>
Binary(A) = Binary(3) = 011
Binary(B) = Binary(5) = 101
The XOR will be minimum when x = 3
i.e. (3 XOR 3) = 0 and the number
of set bits in 3 is equal
to the number of set bits in 5.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
A = 7, B = 12
<strong>Output:</strong> 6
<strong>Explanation:</strong>
(7)<sub>2</sub>= 111
(12)<sub>2</sub>= 1100
The XOR will be minimum when x = 6 
i.e. (6 XOR 7) = 1 and the number 
of set bits in 6 is equal to the 
number of set bits in 12.</span></pre>

<div><strong><span style="font-size:18px">Your task :</span></strong></div>

<div><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>minVal()</strong> that takes integer A and B as input and returns the value of X according to the question.</span></div>

<div>&nbsp;</div>

<div><strong><span style="font-size:18px">Expected Time Complexity : </span></strong><span style="font-size:18px">O(log N)</span></div>

<div><strong><span style="font-size:18px">Expected Auxiliary Space : </span></strong><span style="font-size:18px">O(1)</span></div>

<div>&nbsp;</div>

<div><strong><span style="font-size:18px">Constraints :</span></strong></div>

<div><span style="font-size:18px">1 &lt;= A, B &lt;= 10<sup>9</sup></span></div>

<div>&nbsp;</div>
 <p></p>
            </div>