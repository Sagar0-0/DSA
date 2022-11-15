# Nth item through sum
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given two sorted arrays <strong>A</strong> and <strong>B</strong> of length <strong>L1</strong>&nbsp;and <strong>L2</strong>, we can get a set of sums(add one element from the first and one from second). Find the <strong>N</strong>th element in the set considered in sorted order.<br>
<strong>Note:&nbsp;</strong>Set of sums should have unique elements.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> L1 = 2, L2 = 2
A = {1, 2}
B = {3, 4}
N = 3
<strong>Output:</strong> 6
<strong>Explaination:</strong> The set of sums are in 
the order 4, 5, 6.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> L1 = 5, L2 = 4
A = {1, 3, 4, 8, 10}
B = {20, 22, 30, 40}
N = 4
<strong>Output:</strong> 25
<strong>Explaination:</strong> The numbers before it 
are 21, 23 and 24.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>nthItem() </strong>which takes L1, L2, A, B, and the value N as input parameters and returns the Nth value of the set. If N is greater than the size of the set then it returns <strong>-1</strong>.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O((L1*L2)*log(L1*L2))<br>
<strong>Expected Auxiliary Space:</strong> O(L1*L2)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ L1, L2 ≤ 500<br>
1 ≤ A[i], B[i] ≤ 10000<br>
1 ≤ N ≤ L1*L2</span></p>
 <p></p>
            </div>