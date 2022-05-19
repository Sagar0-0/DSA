# Transform String
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given two strings A and B. Find the minimum number of steps required to transform string A into string B. The only allowed operation for the transformation is selecting a character from string A and inserting it in the beginning of string A.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
A = "abd"
B = "bad"
<strong>Output:</strong> 1
<strong>Explanation: </strong>The conversion can take place in
1 operation: Pick 'b' and place it at the front.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
A = "GeeksForGeeks"
B = "ForGeeksGeeks"
<strong>Output: </strong>3
<strong>Explanation:</strong> The conversion can take
place in 3 operations:
Pick 'r' and place it at the front.
A = "rGeeksFoGeeks"
Pick 'o' and place it at the front.
A = "orGeeksFGeeks"
Pick 'F' and place it at the front.
A = "ForGeeksGeeks"</span></pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp; </strong><br>
You dont need to read input or print anything. Complete the function<strong> transform()</strong> which takes two strings A and B as input parameters and returns the minimum number of steps required to transform A into B. If transformation is not possible return -1.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N) where N is max(length of A,&nbsp;length of B)&nbsp;<br>
<strong>Expected Auxiliary Space: </strong>O(1) &nbsp;</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;= A.length(), B.length()&nbsp;&lt;= 10<sup>4</sup></span></p>

<p>&nbsp;</p>
 <p></p>
            </div>