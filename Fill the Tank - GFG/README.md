# Fill the Tank
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">In a city,&nbsp;<strong>N</strong> water tanks are connected by pipeline(As a tree) where the <strong>ith</strong> tank has a capacity <strong>cap[i]</strong>. The <strong>ith </strong>element of the given <strong>Edge</strong> array of length <strong>N-1</strong> represents that there is a pipeline between <strong>Edge[i][0]</strong> and <strong>Edge[i][1]</strong> tank.&nbsp;Since people working at the city corporation are lazy they usually select one of the tank and pour complete amount of water into it, <strong>when the tank is filled, the excess water evenly flows to the connected tanks.</strong> The head of city corporation has instructed to <strong>pour minimum amount of water into the selected tank so that all other tank is filled</strong>. As the labours of the corporation are not intelligent enough to figure out the minimum amount of water required to fill all the tanks they have asked your help. Also Maximum amount of water available with city corporation is 10<sup>18</sup>.</span></p>

<p><span style="font-size:18px"><strong>NOTE</strong>: If the tank if full, the water flows to all of its connected tanks except the tank from which the water had come to it. i.e, to all tanks except the source for that particular tank. If it has no option to flow the water is considered to be wasted.<strong> S</strong> is the source tank.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 4 and S = 1
Edges = [[1, 2], [1, 3], [2, 4]]
Cap = [1, 1, 1, 1]
<strong>Output:</strong>&nbsp;5
<strong>Explanation</strong>:
Initially 5 unit of water is poured into 
tank 1. 2 unit of it flows to tank 2 <strong>and</strong> 
2 unit of it flows into tank 3. From 2 
unit of water in tank 2, 1 unit flows into 
tank 4 <strong>and</strong> 1 unit from tank 3 is wasted.
<img alt="" src="https://contribute.geeksforgeeks.org/wp-content/uploads/fill-the-tank.jpg" style="height:500px; width:667px" class="img-responsive">

</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 3 and S = 2
Edges = [[1, 2], [2, 3]]
Cap = [1, 1, 1]
<strong>Output: </strong>3
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>minimum_amount()</strong>&nbsp;which takes an integer <strong>N</strong>, an&nbsp;integer&nbsp;<strong>S</strong>, 2-d array <strong>Edges</strong>, and an array <strong>Cap</strong>&nbsp;of length&nbsp;N as input parameters and returns the minimum amount of water required to fill all the tanks. If it is not possible to fill all the tanks print -1.<br>
<br>
<strong>Expected Time Complexity:</strong> O(N*log(S))<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n ≤ 100000<br>
1&nbsp;≤ s,u,v ≤ n<br>
1 ≤ capacity of each tank ≤ 1000000007</span></p>
 <p></p>
            </div>