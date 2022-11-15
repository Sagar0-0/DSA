# Killing Spree
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">There are Infinite People Standing in a row, indexed from 1.<br>
A person having index 'i' has&nbsp;strength of (i*i).<br>
You have Strength 'P'. You need to tell what is the maximum number of People You can Kill With your Strength P.<br>
You can only Kill a person with strength 'X' if P &gt;= 'X' &nbsp;and after killing him, Your Strength decreases by 'X'.&nbsp;</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 14
<strong>Output:</strong>&nbsp;3
<strong>Explanation</strong>:</span>
<span style="font-size:18px">The strengths of people is 1, 4, 9, 16, .... 
and so on. WE can kill the first 3 person , 
after which our Power becomes 0 and we cant 
kill anyone else. So answer is 3</span><span style="font-size:18px">
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 10
<strong>Output: </strong>2
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>killinSpree()</strong>&nbsp;which takes the integer N as input parameters and returns the maximum Number of People You can kill.<br>
<br>
<strong>Expected Time Complexity:</strong> O(log(n))<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ T ≤ 10<sup>3</sup><br>
1 ≤ N ≤ 10<sup>12</sup></span></p>
 <p></p>
            </div>