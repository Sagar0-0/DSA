# Theft at World Bank
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">The worlds most successful thief Albert Spaggiari was planning for his next heist on the world bank. He decides to carry a sack with him, which can carry a maximum weight&nbsp;of <strong>C</strong> kgs. Inside the world bank there were <strong>N</strong>&nbsp;large blocks of gold. All the blocks have some profit value associated with them<em> i.e.</em> if he steals <strong>i<sup>th</sup></strong> block of weight <strong>w[i]</strong> then he will have <strong>p[i] </strong>profit. As blocks were heavy he decided to steal some part of them by cutting them&nbsp;with his cutter.<br>
The thief does not like symmetry, hence, he wishes to not take blocks or parts of them whose weight is a perfect square. Now, you need to find out the maximum profit that he can earn given that he can only carry blocks of gold in his sack.&nbsp;<br>
<strong>Note</strong>: The answer should be precise upto 3 decimal places.</span></p>

<p><span style="font-size:18px"><strong>Example 1 :</strong></span></p>

<pre><span style="font-size:18px">N = 3, C = 10
w[] = {4, 5, 7}
p[] = {8, 5, 4)
<strong>Output: </strong>
7.857
<strong>Explanation: </strong>As first blocks weight is 4
which is a perfect square, he will not use 
this block. Now with the remaining blocks 
the most optimal way is to use 2<sup>nd</sup> block 
completely and cut 5kg piece from the 3<sup>rd</sup> 
block to get a total profit of 5 + 2.857 
= 7.857</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>maximumProfit()</strong>&nbsp;which takes N, C, w[ ] and p[ ]&nbsp;as input parameters and returns the maximum profit thief can achieve with precision&nbsp;upto 3 decimal places.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N * LogN)<br>
<strong>Expected Space Complexity :&nbsp;</strong>O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤&nbsp;10<sup>3</sup><br>
1&nbsp;≤&nbsp;C ≤&nbsp;10<sup>18</sup><br>
1 ≤&nbsp;W<sub>i&nbsp;</sub>≤&nbsp;10<sup>9</sup><br>
1 ≤&nbsp;P<sub>i&nbsp;</sub>≤&nbsp;10<sup>9</sup></span></p>
 <p></p>
            </div>