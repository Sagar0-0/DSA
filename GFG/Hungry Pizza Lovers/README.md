# Hungry Pizza Lovers
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Dominos Pizza has&nbsp;hungry customers waiting in the queue. Each unique order&nbsp;is placed by a customer at time&nbsp;x[i], and the order takes&nbsp;y[i]&nbsp;units of time to complete.<br>
You have information on all&nbsp;n&nbsp;orders, Find the order in which all&nbsp;customers will receive their pizza and return it. If two or more orders are completed at the same time&nbsp;then sort them by non-decreasing order number.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {{4,1}, {6,2}, {7,6}, 
                       {8,1}, {1,3}}
<strong>Output :</strong> 5 1 2 4 3
<strong>Explanation:</strong>
Here an array can be transform to 
{5, 8, 13, 9, 4}. Here 5<sup>th</sup>&nbsp;index order 
received first then 1<sup>st</sup>&nbsp;order, 2<sup>nd</sup>&nbsp;order...
return {5, 1, 2, 4, 3}
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {{1,1}, {1,1}, {1,1}} <strong>
Output :</strong>  1 2 3 </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>permute()</strong> that takes 2-d array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, and return the array of order in which customers will receive their pizza. The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*LOG(N)).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ arr[i][0], arr[i][1] ≤ 10<sup>5</sup></span></p>
 <p></p>
            </div>