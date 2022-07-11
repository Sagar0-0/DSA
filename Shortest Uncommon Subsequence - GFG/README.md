# Shortest Uncommon Subsequence
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given two strings <strong>S</strong> and <strong>T</strong>, find length of the shortest subsequence in <strong>S</strong> which is not a subsequence in <strong>T</strong>. If no such subsequence is possible, return -1. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. A string of length n has&nbsp;<img alt="2^n" src="http://www.geeksforgeeks.org/wp-content/ql-cache/quicklatex.com-e4249a2b3de09582eb567b98f8cd62b1_l3.svg" style="height:12px; width:17px" title="Rendered by QuickLaTeX.com" class="img-responsive">&nbsp;different possible subsequences.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>S = </strong>"babab"</span>
<span style="font-size:18px"><strong>T = </strong>"babba"</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">3</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">There are no subsequences of S with
length less than 3 which is not a
subsequence of T. "aab" is an example of
a subsequence of length 3 which isn't a
subsequence of T.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>S = </strong>"babhi"</span>
<span style="font-size:18px"><strong>T = </strong>"babij"</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">1</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">"h" is a subsequence of S that is
not a subsequence of T.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>shortestUnSub()</strong> which takes two Strings S, and T as input and returns the shortest Uncommon Subsequence.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(|S|<sup>2</sup>*|T|)<br>
<strong>Expected Auxiliary Space:</strong> O(|S|*|T|)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= |S|, |T| &lt;= 500</span></p>
 <p></p>
            </div>