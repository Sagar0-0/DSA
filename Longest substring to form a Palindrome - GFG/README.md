# Longest substring to form a Palindrome
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a string <strong>S </strong>which only contains lowercase alphabets. Find the length of the longest substring of <strong>S</strong> such that the characters in it can be rearranged to form a <a href="https://www.geeksforgeeks.org/c-program-check-given-string-palindrome/" target="_blank">palindrome</a>. </span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>S = "aabe"
<strong>Output:
</strong>3
<strong>Explanation:</strong>
The substring "aab" can be rearranged to
"aba" which is the longest palindrome
possible for this String.</span>
</pre>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre><span style="font-size:18px"><strong>Input:
</strong>S = "adbabd"
<strong>Output:</strong>
6</span>
<span style="font-size:18px"><strong>Explanation:</strong>
The whole string “adbabd” can be
rearranged to form a palindromic substring.
One possible arrangement is "abddba".
Thus, output length of the string is 6. </span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>longestSubstring()</strong>&nbsp;which takes a String S as input and returns the length of largest possible Palindrome.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(|S|*26)<br>
<strong>Expected Auxiliary Space:</strong> O(|S|*26)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ |S| ≤ 10<sup>5</sup></span></p>
 <p></p>
            </div>