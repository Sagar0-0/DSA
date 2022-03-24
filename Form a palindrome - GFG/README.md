# Form a palindrome
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a string, find the minimum number of characters to be inserted to convert it to palindrome.<br>
For Example:<br>
ab: Number of insertions required is 1.&nbsp;<strong>b</strong>ab or aba<br>
aa: Number of insertions required is 0. aa<br>
abcd: Number of insertions required is 3.&nbsp;<strong>dcb</strong>abcd</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
abcd</span>
<span style="font-size:18px"><strong>Output:</strong>
3</span>
<span style="font-size:18px"><strong>Explanation:
</strong>Here we can append 3 characters in the 
beginning,and the resultant string will 
be a palindrome ("dcbabcd").</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
aba</span>
<span style="font-size:18px"><strong>Output:</strong>
0</span>
<span style="font-size:18px"><strong>Explanation:</strong>
Given string is already a pallindrome hence
no insertions are required.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>findMinInsertions()</strong>&nbsp;which takes string S<strong> </strong>as input parameters&nbsp;and returns minimimum numser of insertions required.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(|S|<sup>2</sup>)<br>
<strong>Expected Auxiliary Space:</strong> O(|S|<sup>2</sup>)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ |S| ≤ 500</span></p>
 <p></p>
            </div>