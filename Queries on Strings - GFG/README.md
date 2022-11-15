# Queries on Strings
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a string <strong>str</strong>&nbsp;you have to answer several queries on that string. In each query you will be provided two values <strong>L</strong> and <strong>R</strong> and you have to find the number of <strong>distinct</strong> characters in the sub string from index <strong>L</strong> to index <strong>R</strong>&nbsp;(inclusive) of the original string.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>str = "abcbaed",
Query = {{1,4},{2,4},{1,7}}
<strong>Output: </strong>{3,2,5}
<strong>Explanation: </strong>For the first query distinct 
characters from [1, 4] are a, b and c.
For the second query distinct characters from
[2, 4] are b and c.
For the third query distinct characters from
[1, 7] are a, b, c, d and e.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anyhting. Your task is to complete the function&nbsp;<strong>SolveQueries()&nbsp;</strong>which takes str and Query as input parameter and returns a list containing answer for each query.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(max(26*length of str, 26 * No of queries))<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(26 * length of str)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= |str| &lt;= 10<sup>5</sup><br>
1 &lt;= No of Queries &lt;= 10<sup>4</sup><br>
1 &lt;= L<sub>i</sub>&nbsp;&lt;= R<sub>i</sub>&nbsp;&lt;= |str|</span></p>
 <p></p>
            </div>