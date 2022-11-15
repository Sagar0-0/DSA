# Coin Piles
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">There are <strong>N</strong> piles of coins each containing &nbsp;<strong>Ai</strong> (1&lt;=i&lt;=N) coins. Find the minimum number of coins to be removed such that the absolute difference of coins in any two piles is at most <strong>K.</strong><br>
<strong>Note</strong>:&nbsp;You can also remove a pile by removing all the coins of that pile.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4, K = 0
arr[] = {2, 2, 2, 2}
<strong>Output:
</strong>0
<strong>Explanation:</strong>
</span><span style="font-size:18px">For any two piles the difference in the
number of coins is &lt;=0. So no need to
remove any coins.</span> 
</pre>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 6, K = 3
arr[] = {1, 5, 1, 2, 5, 1} 
<strong>Output :</strong>
2</span>
<span style="font-size:18px"><strong>Explanation:</strong>
</span><span style="font-size:18px">If we remove one coin each from both
the piles containing 5 coins , then
for any two piles the absolute difference
in the number of coins is &lt;=3.</span> 

</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>minSteps()</strong>&nbsp;which takes 2 integers N, and K and an array A of size N as input and returns the minimum number of coins that need to be removed.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N*logN)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
0 ≤ K ≤ 10<sup>4</sup></span><br>
<span style="font-size:18px">1 ≤ A[i] ≤ 10</span><sup style="font-size:18px">3</sup></p>
 <p></p>
            </div>