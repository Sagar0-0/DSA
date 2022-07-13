# Assignment Problem
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">You are the head of a firm and you have to assign jobs to people. You have <strong>N</strong> persons working under you and you have N jobs that are to be done by these persons. Each person has to do exactly one job and each job has to be done by exactly one person. Each person has his own capability (in terms of time taken) to do any particular job. Your task is to assign the jobs to the persons in such a way that the total time taken is minimum. A job can be assigned to only one person and a person can do only one job.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>2</span>
<span style="font-size:18px"><strong>Arr[] = </strong>{3, 5, 10, 1}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">4</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The first person takes times 3 and 5
for jobs 1 and 2 respectively. The second
person takes times 10 and 1 for jobs 1 and
2 respectively. We can see that the optimal
assignment will be to give job 1 to person 1
and job 2 to person 2 for a total for 3+1 = 4.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>3</span>
<span style="font-size:18px"><strong>Arr[] = </strong>{</span><span style="font-size:18px">2, 1, 2,&nbsp;9, 8, 1, 1, 1, 1}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">3 
<strong>Explanation: </strong>
The optimal arrangement would be to assign 
job 1 to person 2,job 2 to person 3 and job 
3 to person 1.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>assignmentProblem()</strong> which takes an Integer N and an array Arr[] of size N<sup>2</sup> as input and returns the time taken for the best possible assignment.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N<sup>2</sup>)<br>
<strong>Expected Auxiliary Space:</strong> O(N<sup>2</sup>)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 30<br>
1 &lt;= Arr[i] &lt;= 100</span></p>
 <p></p>
            </div>