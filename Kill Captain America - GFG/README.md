# Kill Captain America
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Captain America is hiding from Thanos in a maze full of N rooms connected by M gates.<br>
The maze is designed in such a way that each room leads to another room via gates. All connecting gates are unidirectional.&nbsp;Captain America is hiding only in those rooms which are accessible directly/indirectly through every other room in the maze.<br>
Help Thanos find the number of rooms in which Captain America can hide.&nbsp;</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 5 and M = 5
V = [[1, 2], [2, 3], [3, 4], [4, 3], [5, 4]]
<strong>Output:</strong>&nbsp;2
<strong>Explanation</strong>:
<img alt="" src="https://media.geeksforgeeks.org/img-practice/ScreenShot2022-05-06at10-1651814266.png" class="img-responsive">
We can look closesly after forming graph 
than captain america only can hide in a 
room 3 and 4 because they are the only room 
which have gates through them. So,
answer is 2.

</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 2, M = 1
V = [[1, 2]]
<strong>Output: </strong>1
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>captainAmerica()</strong>&nbsp;which takes the integer N, an integer M and 2-d array V&nbsp;as input parameters and returns the Total no of rooms.<br>
<br>
<strong>Expected Time Complexity:</strong> O(</span><span style="font-size:18px">N+M</span><span style="font-size:18px">)<br>
<strong>Expected Auxiliary Space:</strong> O(N+M)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n ≤ 30000<br>
1 ≤ m ≤ 200000<br>
1 ≤ p,q ≤ n</span></p>
 <p></p>
            </div>