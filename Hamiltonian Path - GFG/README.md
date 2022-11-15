# Hamiltonian Path
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">A <a href="https://en.wikipedia.org/wiki/Hamiltonian_path">Hamiltonian path</a>,&nbsp;is a path&nbsp;in an <strong>undirected graph</strong> that visits each vertex exactly once. Given an <strong>undirected&nbsp;graph,</strong>&nbsp;the task is to&nbsp;check if a Hamiltonian path&nbsp;is present in it or not.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4, M = 4
Edges[][]= { {1,2}, {2,3}, {3,4}, {2,4} }
<strong>Output:</strong>
1 
<strong>Explanation: </strong>
There is a hamiltonian path: 
1 -&gt; 2 -&gt; 3 -&gt; 4 </span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4, M = 3 
Edges[][] = { {1,2}, {2,3}, {2,4} } 
<strong>Output: </strong>
0 
<strong>Explanation:</strong> 
It can be proved that there is no 
hamiltonian path in the given graph</span>
</pre>

<p><span style="font-size:18px"><strong>Your task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>check</strong>() which takes the <strong>N&nbsp;</strong>(the number of vertices), <strong>M</strong> (Number of edges) and the list of&nbsp;<strong>Edges</strong>[][] (where Edges[i] denotes the <strong>undirected</strong> Edge between vertices <strong>Edge[i][0] and Edges[i][1]</strong> )&nbsp;as input parameter&nbsp;and returns <strong>true (boolean value)</strong> if the graph contains Hamiltonian path,otherwise returns <strong>false</strong>.&nbsp;</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N!)</span><span style="font-size:18px">.</span><br>
<strong><span style="font-size:18px">Expected Auxiliary Space:</span>&nbsp;</strong><span style="font-size:18px">O(N+M).</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ N ≤ 10</span><br>
<span style="font-size:18px">1 ≤ M ≤ 15</span><br>
<span style="font-size:18px">Size of Edges[i] is&nbsp;2</span><br>
<span style="font-size:18px">1 ≤ Edges[i][0],Edges[i][1] ≤ N</span></p>
</div>