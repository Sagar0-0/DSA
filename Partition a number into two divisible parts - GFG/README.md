# Partition a number into two divisible parts
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a number (as string) and two integers a and b, divide the string in two non-empty parts such that the first part is divisible by a and the second part is divisible by b. In case multiple answers exist, return the string such that the first non-empty part has minimum length.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px">Example 1:</span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
1200 4 3
<strong>Output:</strong>
12 00
<strong>Explanation:</strong>
12 is divisible by 4, and
00 is divisible by 3.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px">Example 2:</span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> </span>
<span style="font-size:18px">125 12 5</span>
<span style="font-size:18px"><strong>Output:</strong> </span>
<span style="font-size:18px">12 5</span>
<span style="font-size:18px"><strong>Explanation:</strong> </span>
<span style="font-size:18px">12 is divisible by 12, and </span>
<span style="font-size:18px">5 is divisible by 5.</span></pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Your Task:</span></strong></p>

<p><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function stringPartition() which takes the string S and returns a string which will be in the form of&nbsp;</span><span style="font-size:18px">first sub-string + " " (Single Space) + second sub-string</span><span style="font-size:18px">. </span><span style="font-size:18px">If not found return -1 as a string.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px">Expected Time Complexity: O(N)<br>
Expected Auxiliary Space: O(N)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span></p>

<p><span style="font-size:18px">1&lt;=N&lt;=10<sup>6</sup></span></p>

<p><span style="font-size:18px">1&lt;=a,b&lt;=N</span></p>
 <p></p>
            </div>