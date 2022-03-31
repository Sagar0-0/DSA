# Nodes at even distance
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a connected acyclic graph with n&nbsp;nodes and n-1 edges, count the pair&nbsp;of nodes that are at even distance(number of edges) from each other.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
n = 3
graph = {{}, {2}, {1, 3}, {2}}
<strong>Output:</strong> 1
<strong>Explaination:</strong> Here there are three pairs {1,2},{1,3}
and {2,3} and only {1,3} has even distance between them.
</span><span style="font-size:18px">i.e</span> <span style="font-size:18px">          1
             /
            2
           /
          3</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
n = 5
graph = {{}, {2,4}, {1,3}, {2}, {1,5}, {4}}
<strong>Output:</strong> 4
<strong>Explaination:</strong> There are four pairs {1,3},{1,5},{2,4}
and {3,5} which has even distance.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>countOfNodes()</strong>&nbsp;which takes the array <strong>graph[]</strong>&nbsp;(given as <a href="https://en.wikipedia.org/wiki/Adjacency_list#:~:text=In%20graph%20theory%20and%20computer,particular%20vertex%20in%20the%20graph." target="_blank">Adjacency list</a>)&nbsp;</span><span style="font-size:18px">and its size <strong>n&nbsp;</strong>as input parameters&nbsp;and returns the count&nbsp;of&nbsp;pair of nodes that are at even distance from each other</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(V+E)<br>
<strong>Expected Auxiliary Space:</strong> O(V)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n&nbsp;≤ 10<sup>4</sup></span></p>
 <p></p>
            </div>