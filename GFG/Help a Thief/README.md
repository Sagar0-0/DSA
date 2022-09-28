# Help a Thief!!!
## Easy
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">You have to help a thief to steal as many as GoldCoins as possible from a GoldMine. There he saw <strong>N</strong> Gold Boxes an each Gold Boxes consists of <strong>A<sub>i</sub></strong> Plates each plates consists of <strong>B<sub>i</sub></strong> Gold Coins. Your task is to print the maximum gold coins theif can steal if he can take a maximum of T plates.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>T = </strong>3, <strong>N = </strong>3</span><strong> </strong>
<span style="font-size:18px"><strong>A[] = </strong>{1, 2, 3}
<strong>B[] = </strong>{3, 2, 1}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">7</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The thief will take 1 plate of coins
from the first box and 2 plate of coins
from the second plate. 3 + 2*2 = 7.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>T = </strong>0, <strong>N = </strong>3</span><strong> </strong>
<span style="font-size:18px"><strong>A[] = </strong>{1, 3, 2}</span>
<span style="font-size:18px"><strong>B[] = </strong>{2, 3, 1}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">0</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The thief can't take any plates.
So he can't steal any coins.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>maxCoins()</strong> which takes 2 Integers T, and N and two arrays A and B of size N as input and returns the maximum number of gold coins the thief can steal if he can take a maximum of T plates.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N*logN)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">0 &lt;= T,N &lt;= 10<sup>4</sup><br>
1 &lt;= A[i] &lt;= 10<sup>4</sup></span><br>
<span style="font-size:18px">1 &lt;= B[i] &lt;= 10<sup>4</sup></span></p>
 <p></p>
            </div>