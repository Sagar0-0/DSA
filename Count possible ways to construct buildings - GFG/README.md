# Count possible ways to construct buildings
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given <strong>N</strong>, the number of plots on either sides of the road. Find the total ways to construct buildings in the plots such that there is a space between any 2 buildings. All plots on one side of the road are continuous.<br>
Lets suppose * represents a plot, then for N=3, the plots can be represented as * * * | | * * * &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;</span></p>

<p><span style="font-size:18px">Where | | represents the road. &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<br>
Note: As the answer can be very large, print it mod 1000000007</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 3
<strong>Output: </strong>25
<strong>Explanation: </strong>3 plots, which means possible
ways for one side are BSS, BSB, SSS, SBS,
SSB where B represents a building and S
represents an empty space Total possible 
ways are 25, because a way to place on one
side can correspond to any of 5 ways on other
side.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 10
<strong>Output: </strong>20736
<strong>Explanation: </strong>There are 20736 ways for N = 10.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>ToralWays()</strong>&nbsp;which takes N as input parameter and returns the total possible ways modulo 10<sup>9</sup>&nbsp;+ 7.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(N)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 100000</span></p>
 <p></p>
            </div>