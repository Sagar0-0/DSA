# Union-Find
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">This problem is to implement disjoint set union. There will be 2 incomplete functions namely union and find. You have to complete these functions.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Union:</strong> Join two subsets into a single set.<br>
<strong>isConnected:</strong> Determine which subset a particular element is in. This can be used for determining if two elements are in same subset.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 5
q = 4
Queries = 
Union(1,3)
isConnected(1,2)
Union(1,5)
isConnected(3,5)
<strong>Output:
</strong>0
1<strong>
Explanation: </strong>Initially all nodes 1 2 3 4 5
are not connected.&nbsp;
After <strong>Union(1,3)</strong>, node 1 and 3 will be
connected.
When we do <strong>isConnected(</strong><strong>1,2)</strong>,&nbsp; as node 1
and 2&nbsp;are not connected it will return 0.
After <strong>Union(1,5)</strong>, node 1 and 5&nbsp;will be
connected.
When we do <strong>isConnected(3,5</strong><strong>)</strong>,&nbsp; as node
1 and 3&nbsp;are&nbsp;connected, and node 1 and 5
are connected, hence 3 and 5 are
connected.&nbsp;Thus it will return 1.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 5
q = 4
Queries = 
Union(1,4)
Union(1,5)
isConnected(2,3)
Union(3,4)
<strong>Output: </strong>0</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong></span></p>

<p><span style="font-size:18px">You have to complete the function <strong>union_() </strong>which merges the node1 and node2. You will also have to complete the function <strong>isConnected() </strong>which will return whether the two nodes are connected.</span></p>

<p><strong><span style="font-size:18px">Note:&nbsp;</span></strong><span style="font-size:18px">Both function will contain two arrays&nbsp;<strong>par[] and ranks1[]&nbsp;</strong>along with two nodes. Initially&nbsp;<strong>par[i] = i </strong>and <strong>rank1[i] = 1&nbsp;</strong></span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N + Q).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>

<p><span style="font-size:18px"><strong>Constraints:&nbsp;</strong><br>
1 &lt;= N &lt;= 10<sup>5</sup><br>
1&lt;= Q &lt;= 10<sup>5</sup><br>
1 &lt;= node1, node2 &lt;= N</span></p>
 <p></p>
            </div>