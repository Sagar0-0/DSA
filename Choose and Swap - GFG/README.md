# Choose and Swap
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">You are given a string <strong>s</strong> of lower case english alphabets. You can choose any two characters in the string and replace all the occurences of the first character with the second character and replace all the occurences of the second character with the first character. Your aim is to find the lexicographically smallest string that can be obtained by doing this operation at most once.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
A = "ccad"
<strong>Output:</strong>&nbsp;"aacd"
<strong>Explanation</strong>:
In ccad, we choose a and c and after 
doing the replacement operation once we get, 
aacd and this is the lexicographically
smallest string possible. </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
A = "abba"
<strong>Output: </strong>"abba"
<strong>Explanation:
</strong>In abba, we can get baab after doing the 
replacement operation once for a and b 
but that is not lexicographically smaller 
than abba. So, the answer is abba. </span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>chooseandswap()</strong>&nbsp;which takes the string A as input parameters and returns the <strong>lexicographically smallest string</strong> that is possible after doing the operation at most once.<br>
<br>
<strong>Expected Time Complexity:</strong> O(|A|) length of the string A<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;= |A| &lt;=10<sup>5</sup></span></p>

<p>&nbsp;</p>
 <p></p>
            </div>