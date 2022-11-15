# Count the paths
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a directed acyclic graph(DAG) with n nodes labeled from 0 to n-1. Given edges, s and d ,count the number of ways to reach from s to d.</span><span style="font-size:18px">There is a directed Edge from vertex edges[i][0]&nbsp;to the vertex&nbsp;edges[i][1].</span></p>

<p><span style="font-size:18px">&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>edges = {{0,1},{0,3},{1,2},{3,2}}, 
n = 4, s = 0, d = 2
<strong>Output: </strong>2
<strong>Explanation: </strong>There are two ways to reach at 
2 from 0. These are-
1. 0-&gt;1-&gt;2
2. 0-&gt;3-&gt;2</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>possible_paths()&nbsp;</strong>which takes edges, n, s and d as input parameter and returns the number of ways to reach from s to d.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Compelxity:&nbsp;</strong>O(2<sup>n</sup>)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(n+e) </span></p>

<p><span style="font-size:18px">where e is the number of edges in the graph.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n &lt;= 15<br>
0 &lt;= s, d &lt;= n-1</span></p>
 <p></p>
            </div>