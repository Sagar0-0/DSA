<h2><a href="https://leetcode.com/problems/short-encoding-of-words/">820. Short Encoding of Words</a></h2><h3>Medium</h3><hr><div><p>A <strong>valid encoding</strong> of an array of <code>words</code> is any reference string <code>s</code> and array of indices <code>indices</code> such that:</p>

<ul>
	<li><code>words.length == indices.length</code></li>
	<li>The reference string <code>s</code> ends with the <code>'#'</code> character.</li>
	<li>For each index <code>indices[i]</code>, the <strong>substring</strong> of <code>s</code> starting from <code>indices[i]</code> and up to (but not including) the next <code>'#'</code> character is equal to <code>words[i]</code>.</li>
</ul>

<p>Given an array of <code>words</code>, return <em>the <strong>length of the shortest reference string</strong> </em><code>s</code><em> possible of any <strong>valid encoding</strong> of </em><code>words</code><em>.</em></p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> words = ["time", "me", "bell"]
<strong>Output:</strong> 10
<strong>Explanation:</strong> A valid encoding would be s = <code>"time#bell#" and indices = [0, 2, 5</code>].
words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "<u>time</u>#bell#"
words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "ti<u>me</u>#bell#"
words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#<u>bell</u>#"
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> words = ["t"]
<strong>Output:</strong> 2
<strong>Explanation:</strong> A valid encoding would be s = "t#" and indices = [0].
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 2000</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 7</code></li>
	<li><code>words[i]</code> consists of only lowercase letters.</li>
</ul>
</div>