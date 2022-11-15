# Course Schedule
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">There are a total of <strong>n</strong> tasks you have to pick, labeled from 0 to n-1. Some tasks may have <strong>prerequisites </strong>tasks, for example to pick task 0 you have to first finish tasks 1, which is expressed as a pair: [0, 1]<br>
Given the total number of <strong>n</strong> tasks and a list of prerequisite pairs of size <strong>m</strong>. Find a ordering of tasks you should pick to finish all tasks.</span><br>
<span style="font-size:18px"><strong>Note: </strong>There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all tasks, return an empty array. Returning any correct order will give the output as <strong>1</strong>, whereas any invalid order will give the output <strong>0.</strong> </span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 2, m = 1
prerequisites = {{1, 0}}
<strong>Output:
</strong>1<strong>
Explanation:
</strong>The output 1 denotes that the order is
valid. So, if you have, implemented
your function correctly, then output
would be 1 for all test cases.</span>
<span style="font-size:18px">One possible order is [0, 1].</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 4, m = 4
prerequisites = {{1, 0},
                 {2, 0},
                 {3, 1},
                 {3, 2}}
<strong>Output:
</strong>1<strong>
Explanation:
</strong>There are a total of 4 tasks to pick.
To pick task 3 you should have finished
both tasks 1 and 2. Both tasks 1 and 2
should be pick after you finished task 0.
So one correct task order is [0, 1, 2, 3].
Another correct ordering is [0, 2, 1, 3].
Returning any of these order will result in
a Output of 1.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function <strong>findOrder</strong>() which takes two integers n, and m and a list of lists of size m*2 denoting the prerequisite pairs as input and returns any correct order to finish all the tasks. Return an empty array if it's impossible to finish all tasks.</span></p>

<div><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n ≤ 10<sup>4</sup></span>

<div><span style="font-size:18px">0 ≤ m ≤ 10<sup>5</sup><br>
0 ≤&nbsp;prerequisites[0],&nbsp;prerequisites[1] ≤ 10<sup>5</sup><br>
All prerequisite pairs are unique</span></div>

<div><span style="font-size:18px">prerequisites[0]&nbsp;≠&nbsp;prerequisites[1]</span></div>
</div>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n+m).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(n+m).</span></p>
 <p></p>
            </div>