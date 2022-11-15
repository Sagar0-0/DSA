# Reverse a sublist of a linked list
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a linked list and positions m and n. Reverse the linked list from position m to n.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input :</span></strong>
<span style="font-size:18px">N = 10</span>
<span style="font-size:18px">Linked List = 1-&gt;7-&gt;5-&gt;3-&gt;9-&gt;8-&gt;10
</span><span style="font-size:18px">                      -&gt;2-&gt;2-&gt;5-&gt;NULL</span>
<span style="font-size:18px">m = 1, n = 8</span>
<span style="font-size:18px"><strong>Output :</strong> 2 10 8 9 3 5 7 1 2 5 </span>
<strong><span style="font-size:18px">Explanation :</span></strong>
<span style="font-size:18px">The nodes from position 1 to 8 
are reversed, resulting in 
</span><span style="font-size:18px">2 10 8 9 3 5 7 1 2 5.</span>

</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 6
Linked List = 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;NULL
m = 2, n = 4</span>
<span style="font-size:18px"><strong>Output:</strong> 1 4 3 2 5 6</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">Nodes from position 2 to 4 
are reversed resulting in</span>
<span style="font-size:18px">1 4 3 2 5 6.</span></pre>

<div><strong><span style="font-size:18px">Your task :</span></strong></div>

<div><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>reverseBetween()</strong> which takes the head of the linked list and two integers m and n as input and returns the head of the new linked list after reversing the nodes from position m to n.</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)</span></div>

<div><span style="font-size:18px"><strong>Expected Auxiliary Space: </strong>O(1)</span></div>

<div>&nbsp;</div>

<div><strong><span style="font-size:18px">Constraints:</span></strong></div>

<div><span style="font-size:18px">1&lt;=N&lt;=10^5</span></div>
 <p></p>
            </div>