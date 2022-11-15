# Villain Con
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">The minions are very elitist in nature. If minion x admires minion y, then y thinks too highly of himself and does not admire x back. Also, if x admires y, x also admires everyone that y admires.<br>
All the&nbsp;minions are going to be present at the Villain Con. They want&nbsp;to make sure that they do not dress in the&nbsp;same color as someone who admires them.&nbsp;<br>
There are <strong>N</strong> minions and <strong>M</strong> relations between them. The relations are given in a 2D array <strong>mat</strong>. Each relation is given in x<sub>i</sub>&nbsp;, y<sub>i</sub>&nbsp;format where y<sub>i</sub>&nbsp;admires x<sub>i. </sub>Find the minimum number of different colours that the minions will be dressing in.&nbsp;</span></p>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
N = 5, M = 6
mat = {{1, 3}, 
&nbsp;      {2, 3}, 
&nbsp;      {3, 4}, 
&nbsp;      {1, 4}, 
&nbsp;      {2, 5}, 
&nbsp;      {3, 5}}
<strong>Output:</strong> 3
<strong>Explaination:
</strong>If we assign red colour to 1 and 2,
green colour to 3, and blue colour to 4 and 5, then
every minion will have different coloured dresses
from the one who admires them.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 3, M = 2
mat = {{1,3},{2,3}}</span><strong><span style="font-size:18px">
Output:
</span></strong><span style="font-size:18px">2</span><strong><span style="font-size:18px">
Explanation:
</span></strong><span style="font-size:18px">If we assign red colour to 1 and 2, and green colour to 3, then the condition is satisfied.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>minColour()</strong> which takes N, M and mat[][] as input parameters and returns the minimum number of colours required.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N+M)<br>
<strong>Expected Auxiliary Space:</strong> O(N+M)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ M ≤ 2*10<sup>5</sup>&nbsp;&nbsp;<br>
1 ≤ x<sub>i</sub> , y<sub>i</sub> ≤ N</span></p>
 <p></p>
            </div>