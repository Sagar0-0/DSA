# Eulerian Path in an Undirected Graph
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an adjacency matrix representation of an unweighted undirected graph named&nbsp;<strong>graph</strong>, which has <strong>N</strong> vertices. You have to find out if there is an <a href="https://en.wikipedia.org/wiki/Eulerian_path" target="_blank">eulerian path</a> present in the graph&nbsp;or not.<br>
<strong>Note:</strong> The graph consists of a single component</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> N = 5
graph = {{0, 1, 0, 0, 1}, 
&nbsp;        {1, 0, 1, 1, 0}, 
&nbsp;        {0, 1, 0, 1, 0}, 
&nbsp;        {0, 1, 1, 0, 0}, 
&nbsp;        {1, 0, 0, 0, 0}}
<strong>Output:</strong> 1
<strong>Explaination:</strong> There is an eulerian path. 
The path is 5-&gt;1-&gt;2-&gt;4-&gt;3-&gt;2.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> N = 5
graph = {{0, 1, 0, 1, 1}, 
&nbsp;        {1, 0, 1, 0, 1}, 
&nbsp;        {0, 1, 0, 1, 1}, 
&nbsp;        {1, 1, 1, 0, 0}, 
&nbsp;        {1, 0, 1, 0, 0}}
<strong>Output:</strong> 0
<strong>Explaination:</strong> There is no eulerian path in 
the graph.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>eulerPath()</strong> which takes N and graph as input parameters and returns 1 if there is an eulerian path. Otherwise returns 0.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N<sup>2</sup>)<br>
<strong>Expected Auxiliary Space:</strong> O(N<sup>2</sup>)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 50&nbsp;</span></p>
 <p></p>
            </div>