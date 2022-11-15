<h2><a href="https://leetcode.com/problems/unique-morse-code-words/">804. Unique Morse Code Words</a></h2><h3>Easy</h3><hr><div><p>International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:</p>

<ul>
	<li><code>'a'</code> maps to <code>".-"</code>,</li>
	<li><code>'b'</code> maps to <code>"-..."</code>,</li>
	<li><code>'c'</code> maps to <code>"-.-."</code>, and so on.</li>
</ul>

<p>For convenience, the full table for the <code>26</code> letters of the English alphabet is given below:</p>

<pre>[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]</pre>

<p>Given an array of strings <code>words</code> where each word can be written as a concatenation of the Morse code of each letter.</p>

<ul>
	<li>For example, <code>"cab"</code> can be written as <code>"-.-..--..."</code>, which is the concatenation of <code>"-.-."</code>, <code>".-"</code>, and <code>"-..."</code>. We will call such a concatenation the <strong>transformation</strong> of a word.</li>
</ul>

<p>Return <em>the number of different <strong>transformations</strong> among all words we have</em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> words = ["gin","zen","gig","msg"]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The transformation of each word is:
"gin" -&gt; "--...-."
"zen" -&gt; "--...-."
"gig" -&gt; "--...--."
"msg" -&gt; "--...--."
There are 2 different transformations: "--...-." and "--...--.".
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> words = ["a"]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 100</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 12</code></li>
	<li><code>words[i]</code> consists of lowercase English letters.</li>
</ul>
</div>