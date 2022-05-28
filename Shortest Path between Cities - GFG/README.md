# Shortest Path between Cities
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Geek lives in a special city where houses are arranged in a hierarchial manner. Starting from house number 1, each house leads to two more houses. &nbsp;<br>
1 leads to 2 and 3.&nbsp;<br>
2 leads to 4 and 5.&nbsp;<br>
3 leads to 6 and 7. and so on.&nbsp;<br>
Given the house numbers on two houses x and y, find the length of the shortest path between them.&nbsp;</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
x = 2, y = 6
<strong>Output:</strong> 3
<strong>Explanation:</strong>
              1
          /      \
        /          \
       2             3
     /   \         /   \
    4     5       6     7         
   / \   / \     / \   / \
  8  9  10 11   12 13 14 15</span>
<span style="font-size:18px">
The length of the shortest path between 2 
and 6 is 3. ie </span><span style="font-size:18px">2-&gt; 1-&gt; 3-&gt; 6.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
x = 8, y = 10
<strong>Output: </strong>4
<strong>Explanation: </strong>8-&gt; 4-&gt; 2-&gt; 5-&gt; 10
The length of the shortest path between 8 
and 10 is 4. </span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Complete the function <strong>shortestPath()</strong> which takes integers x and y as input parameters and returns the length of the shortest path from x to y.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(log(max(x,y)))<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:&nbsp;</strong><br>
1 &lt;= x,y &lt;= 10<sup>9</sup></span></p>
 <p></p>
            </div>