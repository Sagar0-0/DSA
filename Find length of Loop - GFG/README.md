# Find length of Loop
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a linked list of size <strong>N</strong>. The task is to complete the function&nbsp;<strong>countNodesinLoop()&nbsp;</strong>that checks whether a given Linked List contains a&nbsp;<strong>loop or not&nbsp;</strong>and if the&nbsp;<strong>loop </strong>is present then<strong> return the count of nodes</strong> in a loop or else <strong>return 0. C&nbsp;</strong>is the position of the node to which the last node is connected. If it is 0 then no loop.</span></p>

<p><span style="font-size:18px"><img alt="" src="https://contribute.geeksforgeeks.org/wp-content/uploads/linkedlist.png" style="height:236px; width:512px" class="img-responsive"> </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 10
value[]={25,14,19,33,10,21,39,90,58,45}
C = 4
<strong>Output: </strong>7<strong>
Explanation: </strong>The loop is 45-&gt;33. So
length of loop is 33-&gt;<em>10</em>-&gt;21-&gt;39-&gt;
90-&gt;58-&gt;<em>45</em> = <strong>7. </strong>The number 33&nbsp;is
connected to the last node to form the
loop because according to the input the
4<sup>th</sup> node from the beginning(1&nbsp;based
index) will be connected to the last
node for the loop.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 2
value[] = {1,0}
C = 1
<strong>Output: </strong>2<strong>
Explanation: </strong>The length of the loop
is 2.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function <strong>countNodesinLoop</strong>() which contains the only argument as reference to head of<strong> linked list&nbsp;</strong>and return the lenght of the loop ( 0 if there is no loop).</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 500<br>
0 &lt;= C &lt;= N-1</span></p>
 <p></p>
            </div>