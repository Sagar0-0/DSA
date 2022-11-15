# Magnet Array Problem
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given <strong>N</strong> Magnets which are placed linearly, with each magnet to be considered as of point object. Each magnet suffers force from its left sided magnets such that they repel it to the right and vice versa. <strong>All forces are repulsive</strong>. The force being equal to the distance (1/d ,&nbsp;d being the distance). Now given the positions of the magnets, the task to find&nbsp;all the points along the linear line where net force is <strong>ZERO</strong>.&nbsp;</span></p>

<p><span style="font-size:18px">More Formally, Magnets are placed on X axis, the coordinates of which are given, you are asked to find out the X-co-ordinates of all the equilibrium points (i.e. the point where net force is zero). You notice the point each magnet repels each other, it means the polarity of the magnet is such that exerts +ve force in its right side and -ve force in left side, (here +ve is considered in +ve direction of x-axis). And that forces are inversely proportional to the distance, thus there lies an equilibrium point between every two magnetic points. Thus there will be total of <strong>N-1</strong> equllibrium points. You have to find those N-1 points.<br>
<strong>Note:</strong> Array <strong>M[]</strong> is <strong>sorted</strong> and distance have to be calculated with precision of <strong>2 decimal places</strong>.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 2
M[] = {1, 2}
<strong>Output:</strong>
1.50
<strong>Explanation:
</strong>The mid point of two points will have 
net force zero, thus answer = 1.50
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
M[] = {0, 10, 20, 30}
<strong>Output:</strong>
3.82, 15.00, 26.18</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>nullPoints()</strong>&nbsp;which takes the array <strong>M[]</strong>, its size <strong>N </strong>as inputs and an answer array<strong> getAnswer[] </strong>to <strong>store</strong> the points having <strong>net force zero</strong> till precised two decimal places.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N<sup>2</sup>&nbsp;* Log(N))<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
2 ≤ N ≤ 10<sup>5</sup><br>
0 ≤ &nbsp;M[1] &lt; ....M[i] &lt; M[i+1] &lt; ....M[N] ≤ 10<sup>6</sup></span><br>
&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>
 <p></p>
            </div>