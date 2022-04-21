# Recursively remove all adjacent duplicates
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a string s, remove all its adjacent duplicate characters recursively.&nbsp;</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
S = "geeksforgeek"
<strong>Output:</strong> "gksforgk"
<strong>Explanation: </strong>
g(ee)ksforg(ee)k -&gt; gksforgk</span></pre>

<p><br>
<strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input: 
</strong>S = "abccbccba"
<strong>Output:</strong> ""
<strong>Explanation: 
</strong>ab(cc)b(cc)ba-&gt;abbba-&gt;a(bbb)a-&gt;aa-&gt;(aa)-&gt;""(empty string)</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>remove()</strong> which takes the string S as input parameter and returns the resultant string.<br>
<strong>Note:</strong> For some test cases, the resultant string would be an <strong>empty</strong> string. For that case, the function should return the empty string only.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(|S|)<br>
<strong>Expected Auxiliary Space:</strong> O(|S|)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=|S|&lt;=10<sup>5</sup></span></p>
 <p></p>
            </div>