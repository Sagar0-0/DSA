# Smallest distinct window
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a string '<strong>s</strong>'. The task is to find the <strong>smallest </strong>window length&nbsp;that contains all the characters of the given string at least one time.<br>
For eg. A = <strong>aabcbcdbca</strong>, then the result would be 4 as of the smallest window will be <strong>dbca</strong>.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<div>
<pre><span style="font-size:18px">Input : "AABBBCBBAC"
Output : 3
Explanation : Sub-string -&gt; "BAC"
</span></pre>
</div>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre><span style="font-size:18px">Input : "aaab"
Output : 2
Explanation : Sub-string -&gt; "ab"</span></pre>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Example 3:</strong></span></div>

<pre><span style="font-size:18px">Input : "GEEKSGEEKSFOR"
Output : 8
Explanation : Sub-string -&gt; "GEEKSFOR"</span></pre>

<p>&nbsp;</p>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>findSubString()</strong>&nbsp;which takes the string&nbsp; <strong>S</strong><strong> </strong>as input&nbsp;and returns the length of the smallest such window of the string.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(256.N)<br>
<strong>Expected Auxiliary Space:</strong> O(256)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ |S| ≤ 10<sup>5</sup><br>
String may contain both type of English Alphabets.</span></p>
 <p></p>
            </div>