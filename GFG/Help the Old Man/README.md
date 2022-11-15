# Help the Old Man!!!
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">A poor old man works in a palace for a living. One day the old man's wife met with an accident. She needed an immediate operation but the old man's savings were not enough for the operation. He went running to the king to beg for money. The king told that he will not only pay the full amount for the operation but also double his salary. But for that the old man had to pass a test. The king showed him a pile of glass plates kept one above another, each one being smaller than the one beneath. The plates were kept in box 1. He had to transfer the plates to box 3 using box 2. However, there were some constraints. The old man could only take one plate at a time and he could only place a&nbsp;smaller plate on top of a larger plate. He could take a plate only from the top. Help the old man do so. There are <strong>N</strong> plates and he has to tell the <strong>n</strong>th move in the format <strong>(i, j)</strong> where a plate is being moved <strong>from ith box to jth box.</strong></span></p>

<p><span style="font-size:18px"><strong>Note:</strong><br>
Given any number of plates, they can be transferred from box 1 to box 3 using box 2 using the following steps.<br>
Step 1: Transfer first N-1 plates from box 1 to box 2 using box 3.<br>
Step 2: Transfer the remaining plate from box 1 to box 3.<br>
Step 3: Transfer the first N-1 plates from box 2 to box 3 using box 1.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> N = 2, n = 2
<strong>Output:</strong> 1 3
<strong>Explaination:</strong>  The plate on top of box 1 is 
first transferred to box 2. The second plate 
from box 1 is transferred to box 3 and finally 
the plate from box 2 is transferred to box 3. 
In each situation, all the constraints are 
satisfied. You are required to print the 2nd 
move which is "Move plate from box 1 to box 3", 
hence 1 3.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> N = 3, n = 4.
<strong>Output:</strong> 1 3
<strong>Explaination:</strong> The movements of plates will 
be from 1 to 3. Then from 1 to 2. Then from 
3 to 2. And finally 4th move from 1 to 3.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anyting. Your task is to complete the function <strong>shiftPile()</strong> which takes N and n as input parameters and returns the nth move in a list.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(2<sup>N</sup>)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 20<br>
1 ≤ n ≤ 1000&nbsp;</span></p>
 <p></p>
            </div>