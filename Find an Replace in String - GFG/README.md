# Find an Replace in String
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a string <strong>S </strong>on which you need to perform <strong>Q</strong> replace operations.</span><br>
<span style="font-size:18px">Each replacement operation has 3 parameters: a starting index i, a source word x and a target word y. The rule is that if x starts at position i in the <strong>original</strong> <strong>string S</strong>, then we will replace that occurrence of x with y. If not, we do nothing.<br>
<strong>Note: </strong></span> <span style="font-size:18px">All these operations occur simultaneously. It's guaranteed that there won't be any overlap in replacement: for example, S = "abc", indexes = [0,1], sources = ["ab", "bc"] is not a valid test case. </span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: 
S = "gforks"
Q = 2
index[] = {0, 4}
sources[] = {"g", "ks"}
targets[] = {"geeks", "geeks"}
<strong>Output</strong>: 
geeksforgeeks
<strong>Explanation</strong>:
"g" starts at index 0, so, it's reaplaced by
"geeks". Similarly, "ks" starts at index 4,
and is replaced by "geeks".</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: 
S = "gforks"
Q = 2
index[] = {0, 3}
sources[] = {"g", "ss"}
targets[] = {"geeks", "geeks"}
<strong>Output</strong>: 
geeksforks
<strong>Explanation</strong>:
"g" starts at index 0, so, it's reaplaced by
"geeks". "ss" doesn't start at index 3 in
<strong>original</strong> <strong>S, </strong>so it's not replaced.</span></pre>

<p><br>
<strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">You don't need to read input or print anything.&nbsp;You only need to complete the function<strong> findAndReplace()&nbsp;</strong>that takes a string S, an integer Q, and 3 arrays index, sources, and targets of size Q, as input and returns the new string after all the operations. index[i], sources[i], and targets[i] denotes the index, sources, and targets for i<sub>th</sub> query.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> &nbsp;O(|S| * Q)<br>
<strong>Expected Auxilliary Space:</strong> O(Q)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ |S| ≤ 10<sup>4</sup><br>
1 ≤ Q ≤ 100<br>
1 ≤ length of sources<sub>i</sub>, targets<sub>i</sub> ≤ 100</span></p>
 <p></p>
            </div>