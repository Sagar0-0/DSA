# Polynomial Addition
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given two polynomial numbers represented by a linked list. The task is to complete the function <strong>addPolynomial()</strong>&nbsp;that adds these lists meaning&nbsp;adds the coefficients who have the same variable powers.<br>
<strong>Note:</strong>&nbsp;</span>&nbsp;<span style="font-size:18px">G</span><span style="font-size:18px">iven polynomials are sorted in decreasing order of power.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList1:  (1,x<sup>2) </sup>
LinkedList2:  (1,x<sup>3</sup>)
<strong>Output:
</strong>1x^3 + 1x^2
<strong>Explanation: </strong>Since, x<sup>2</sup> and x<sup>3</sup> both have
different powers as 2 and 3. So, their
coefficient can't be added up.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList1:  (1,x<sup>3</sup>) -&gt; (2,x<sup>2</sup>)
LinkedList2:  (3,x<sup>3</sup>) -&gt; (4,x<sup>2</sup>)
<strong>Output:
</strong>4x^3&nbsp;+ 6x^2
<strong>Explanation: </strong>Since, x<sup>3</sup> has two different
coefficients as 3 and 1. Adding them up
will lead to 4x<sup>3</sup>. Also, x<sup>2</sup> has two
coefficients as 4 and 2. So, adding them
up will give 6x<sup>2</sup>.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function&nbsp;<strong>addPolynomial</strong>() which should add the polynomial with same powers&nbsp;return the required polynomial in decreasing order of the power in the form of a linked list.<br>
<strong>Note</strong>: Try to solve the question without using any extra space.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N+M)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N, M &lt;= 10<sup>5</sup><br>
1 &lt;= x, y &lt;= 10<sup>6</sup></span></p>
 <p></p>
            </div>